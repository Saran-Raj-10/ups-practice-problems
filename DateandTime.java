import java.time.LocalDate;
import java.time.LocalTime;
interface d1 {
    default void displayDate(){}
    default void displayTime() {
        LocalTime cT = LocalTime.now();
        System.out.println(cT);
    }
}
class d2 implements d1 {
    public void displayDate() {
        LocalDate cD = LocalDate.now();
        System.out.println(cD);
    }
}

public class DateandTime {
    public static void main(String[] args) {
        d1 obj = new d2();
        obj.displayDate();
        obj.displayTime();
    }
}
