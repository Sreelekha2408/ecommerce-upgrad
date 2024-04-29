package DataStructures;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Product {
    double price;
    String clothes;

    String category;

    public Product(String category, String clothes,double price) {
        this.category = category;
        this.price = price;
        this.clothes = clothes;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

}
public class ProductManager {

    ArrayList<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public List<Product> getSortedProducts(Comparator<Product> comparator) {
        Collections.sort(products, comparator);
        return products;
    }
    public List<Product> filterProducts(Predicate<Product> predicate) {
        return products.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Product product1 = new Product("Education", "Book", 25.0);
        Product product2 = new Product("Clothing", "Shirt", 35.0);
        Product product3 = new Product("Electronics", "Laptop", 1200.0);
        ProductManager productManager = new ProductManager();
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        List<Product> sortedProducts = productManager.getSortedProducts(Comparator.comparingDouble(Product:: getPrice));
        ArrayList<String> list = new ArrayList<>();
        for(Product p : sortedProducts) {
            list.add(p.getClothes()+" ("+p.getCategory() + ") - $" + p.getPrice());
        }
        List<Product> filteredProducts = productManager.filterProducts(product -> product.category == "Clothing");
        ArrayList<String> filteredProductsArray = new ArrayList<>();
        for(Product p : filteredProducts) {
            filteredProductsArray.add(p.getClothes()+" ("+p.getCategory() + ") - $" + p.getPrice());
        }
        System.out.println("Sorted by price: "+list);
        System.out.println("Clothing products: "+filteredProductsArray);
    }
}
