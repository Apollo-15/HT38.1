package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                \nKeys:
                1. Show all products
                2. Add product to cart
                3. Remove product from cart
                4. Show cart contents
                5. Exit
                Enter your choice:
                """);

            String input = scanner.nextLine();

            switch (input) {
                case "1" -> {
                    System.out.println("\nList of available products:");
                    productRepository.findAll().forEach(System.out::println);
                }

                case "2" -> {
                    System.out.print("Input ID of the product to add to cart: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Product product = productRepository.findById(id);
                    if (product != null) {
                        cart.addProduct(product);
                        System.out.println("The product has been added to the cart: " + product);
                    } else {
                        System.out.println("Product with ID " + id + " not found.");
                    }
                }

                case "3" -> {
                    System.out.print("Input ID of the product to remove from cart: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    cart.removeProductById(id);
                    System.out.println("Product with ID " + id + " has been removed from the cart.");
                }

                case "4" -> {
                    System.out.println("\nContents of the cart:");
                    if (cart.getProducts().isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        cart.getProducts().forEach(System.out::println);
                    }
                }

                case "5" -> {
                    System.out.println("Exiting the program. Thank you for using our service!");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Unknown command. Please try again.");
            }
        }
    }
}
