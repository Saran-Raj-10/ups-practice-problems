import java.util.ArrayList;
import java.util.List;
class ShoppingCart
{
    private List<String> items = new ArrayList<>();
    private List<Double> prices = new ArrayList<>();
    public void addItem(String name, double price) {
        items.add(name);
        prices.add(price);
    }
    public void removeItem(String name) {
        int index = items.indexOf(name);
        if (index != -1) {
            items.remove(index);
            prices.remove(index);
        }
    }
    public double calculateTotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}

public class Shopping
{
    public static void main(String[] args)
    {
        ShoppingCart obj = new ShoppingCart();

        obj.addItem("pc", 1000.0);
        obj.addItem("Mob", 500.0);
        obj.addItem("Food",100.00);
        obj.removeItem("Mob");
        System.out.println(obj.calculateTotal());
    }
}
