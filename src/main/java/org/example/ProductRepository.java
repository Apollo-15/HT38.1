package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1, "Xiaomi 14T", 1836.72));
        products.add(new Product(2, "Xiaomi 14T Pro", 2154.84));
        products.add(new Product(3, "Xiaomi 14", 3262.32));
        products.add(new Product(4, "Xiaomi 14 Pro", 3980.44));
    }

    // -----------------CRUD--------------------

    // CREATE
    public void save(Product product) {
        products.add(product);
    }

    // READ
    public List<Product> findAll() {
        return products;
    }

    // UPDATE
    public boolean update(Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == updatedProduct.getId()) {
                products.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean deleteById(int id) {
        return products.removeIf(product -> product.getId() == id);
    }

    public Product findById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }
}

