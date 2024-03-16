package com.company;
import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Product> cart;

    public Customer(String name) {
        this.name = name;
        cart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public void listCart() {
        for (Product product : cart) {
            System.out.println(product.GetDescription());
        }
    }

    public void sellProduct(Product product, Customer customer) {
        // Implement selling logic here
    }
}
