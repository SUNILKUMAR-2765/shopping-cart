import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Add Product
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter product quality: ");
                    String quality = scanner.nextLine();
                    Product product = new Product(name, price, quality);
                    cart.addProduct(product);
                    break;

                case "2":
                    // Remove Product
                    System.out.print("Enter product name to remove: ");
                    String productName = scanner.nextLine();
                    cart.removeProduct(productName);
                    break;

                case "3":
                    // Display Cart Details
                    cart.displayCartDetails();
                    break;

                case "4":
                    // Exit
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}