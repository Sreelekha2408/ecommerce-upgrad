import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<shop> cart = new ArrayList<>();

    {/* Difference between arrayList and HashMap */}
//    private Map<String, Double> items = new HashMap<>();

    void addToCart(shop item){
        cart.add(item);
    }
    void removeFromCart(shop item) {
        cart.remove(item);
    }

    void displayItems() {
        System.out.println("Items in the Shopping Cart:");
        for (shop item: cart) {
            System.out.println("Item: "+ item.itemName +", Price: $"+ item.price);
        }
    }

    void calculateTotalCartPrice() {
        double sum = 0;
        for (shop item: cart) {
            sum += item.price;
        }
        System.out.println("Total Price: $"+sum);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        shop item1 = new shop("Shirt", 25.99);
        shop item2 = new shop("Jeans", 39.99);
        cart.addToCart(item1);
        cart.addToCart(item2);
        cart.displayItems();
        cart.removeFromCart(item1);
        shop item3 = new shop("Shoes", 49.99);
        cart.addToCart(item3);
        System.out.println();
        cart.displayItems();
        System.out.println();
        cart.calculateTotalCartPrice();
    }
}

class shop {
    String itemName;
    double price;

    public shop(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
}