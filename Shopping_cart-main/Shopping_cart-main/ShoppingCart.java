import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " has been added to the cart.");
    }

    public void removeProduct(String productName) {
        boolean found = false;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                products.remove(product);
                System.out.println(productName + " has been removed from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(productName + " not found in the cart.");
        }
    }

    public void displayCartDetails() {
        if (products.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Shopping Cart Details:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.printf("Total Price: $%.2f%n", calculateTotalPrice());
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}