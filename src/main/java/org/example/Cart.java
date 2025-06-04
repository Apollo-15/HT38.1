package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProductById(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
