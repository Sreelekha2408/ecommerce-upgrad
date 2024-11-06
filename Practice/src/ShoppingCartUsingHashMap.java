import java.util.HashMap;
import java.util.Map;

class Shopping {
    private Map<String, Double> items = new HashMap<>();

    public void addItem(String itemName, double price) {
        items.put(itemName, price);
    }

    public void removeItem(String itemName) {
        items.remove(itemName);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (double price : items.values()) {
            totalPrice += price;
        }
        return totalPrice;
    }

    public void displayItems() {
        System.out.println("Items in the Shopping Cart:");
        for (String itemName : items.keySet()) {
            System.out.println("Item: " + itemName + ", Price: $" + items.get(itemName));
        }
    }
}

public class ShoppingCartUsingHashMap {
    public static void main(String[] args) {
        Shopping cart = new Shopping();
        cart.addItem("Shirt", 25.99);
        cart.addItem("Jeans", 39.99);
        cart.displayItems();

        cart.removeItem("Shirt");
        cart.addItem("Shoes", 49.99);
        cart.displayItems();

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}
