/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommerce;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Logo
 */
public class Ecommerce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         Customer customer = new Customer("Ali", 1000);
        Cart cart = new Cart();

        Product cheese = new ExpierShappableProduct("Cheese", 100, 5, LocalDate.of(2025, 7, 10), 400);
        Product biscuits = new ExpirableProduct("Biscuits", 150, 5, LocalDate.of(2025, 7, 20));
        Product scratchCard = new Product("ScratchCard", 50, 10);
        Product tv = new ShippableProduct("TV", 300, 3, 700);

        cart.addProduct(cheese, 2);
        cart.addProduct(biscuits, 1);
        cart.addProduct(scratchCard, 1);

        customer.checkout(cart);
        
    }
}
