package com.ecommerce;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("003", "Laptop", "Electronics"),
                new Product("001", "Smartphone", "Electronics"),
                new Product("002", "Headphones", "Accessories")
        };


        Product resultLinear = SearchUtil.linearSearch(products, "001");
        System.out.println("Linear Search Result: " + resultLinear);


        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));


        Product resultBinary = SearchUtil.binarySearch(products, "001");
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
