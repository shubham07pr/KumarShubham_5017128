package com.inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> productMap;

    public Inventory() {
        productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        productMap.put(productId, updatedProduct);
    }

    public void deleteProduct(String productId) {
        productMap.remove(productId);
    }

    public Product getProduct(String productId) {
        return productMap.get(productId);
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        Product product1 = new Product("001", "Laptop", 10, 999.99);
        Product product2 = new Product("002", "Smartphone", 20, 499.99);
        inventory.addProduct(product1);
        inventory.addProduct(product2);


        System.out.println("Product 001: " + inventory.getProduct("001").getProductName());


        Product updatedProduct1 = new Product("001", "Laptop", 15, 999.99);
        inventory.updateProduct("001", updatedProduct1);


        inventory.deleteProduct("002");


        Product deletedProduct = inventory.getProduct("002");
        if (deletedProduct == null) {
            System.out.println("Product 002 not found.");
        }
    }
}
