import java.util.Comparator;
import java.util.TreeSet;
class Student {
    int id;
    String name;
    double grade;
    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (Double.compare(s1.grade, s2.grade) == 0) {
            return s1.name.compareTo(s2.name);
        }
        return Double.compare(s2.grade, s1.grade);
    }
}
public class treesetcode {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student(1, "A", 88.5));
        students.add(new Student(2, "B", 92));
        students.add(new Student(3, "C", 88.5));
        students.add(new Student(4, "D", 85));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
