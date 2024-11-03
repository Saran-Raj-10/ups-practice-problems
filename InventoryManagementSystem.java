import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
class Inventory {
    private ArrayList<Product> products = new ArrayList<>();
    void addProduct(Product product) {
        for (Product p : products) {
            if (p.name.equals(product.name)) {
                p.quantity += product.quantity;
                return;
            }
        }
        products.add(product);
    }
    void removeProduct(String productName) {
        products.removeIf(p -> p.name.equals(productName));
    }
    void displayProducts() {
        for (Product p : products) {
            System.out.println("Name: " + p.name + ", Price: $" + p.price + ", Quantity: " + p.quantity);
        }
    }
    double getTotalInventoryValue() {
        double totalValue = 0;
        for (Product p : products) {
            totalValue += p.price * p.quantity;
        }
        return totalValue;
    }
}
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Products");
            System.out.println("4. Get Total Inventory Value");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addProduct(new Product(name, price, quantity));
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String productName = scanner.nextLine();
                    inventory.removeProduct(productName);
                    break;

                case 3:
                    inventory.displayProducts();
                    break;

                case 4:
                    System.out.println("Total Inventory Value: $" + inventory.getTotalInventoryValue());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
