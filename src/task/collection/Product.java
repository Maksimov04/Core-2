package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Product {
    int id;
    String name;
    int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void productsQuantityZero(List<Product> products) {
        for (Product pr : products) {
            if (pr.getQuantity() == 0) {
                System.out.println("ID: " + pr.getId() + ", Name: " + pr.getName() + ", Quantity: " + pr.getQuantity());
            }
        }
    }

    public static int getTotalQuantity(List<Product> products) {
        int total = 0;
        for (Product pr2 : products) {
            total += pr2.getQuantity();
        }
        return total;
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "BMW", 5));
        products.add(new Product(2, "Mercedes", 0));
        products.add(new Product(3, "KIA", 10));

        System.out.println("Products with zero quantity:");
        productsQuantityZero(products);

        int totalQuantity = getTotalQuantity(products);
        System.out.println("\nTotal quantity of all products: " + totalQuantity);
    }
}

