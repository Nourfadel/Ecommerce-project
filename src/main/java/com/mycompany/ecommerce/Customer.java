/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Logo
 */
public class Customer {

    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void checkout(Cart cart) {
        if (cart.isEmpty()) {
            throw new IllegalArgumentException("Cart is empty.");
        }

        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product p = entry.getKey();
            if (p.isExpiered()) {
                throw new IllegalArgumentException("Product " + p.getName() + " is expired.");
            }
            if (entry.getValue() > p.getQuantity()) {
                throw new IllegalArgumentException("Not enough stock for " + p.getName());
            }
        }

        double subtotal = cart.getSubtotal();
        double shippingFee = cart.getShippableItems().isEmpty() ? 0 : 30; // ثابت كمثال
        double total = subtotal + shippingFee;

        if (balance < total) {
            throw new IllegalArgumentException("Not enough balance.");
        }

        // خصم الرصيد وتقليل الكمية
        balance -= total;
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            entry.getKey().decreaseQuantity(entry.getValue());
        }

        // شحن إن وجد
        List<Shippable> shippables = cart.getShippableItems();
        if (!shippables.isEmpty()) {
            Shopping.ship(shippables);
        }

        // طباعة الفاتورة
        System.out.println("** Checkout receipt **");
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            System.out.println(entry.getValue() + "x " + entry.getKey().getName());
            System.out.println((int)(entry.getKey().getPrice() * entry.getValue()));
        }

        System.out.println("----------------------");
        System.out.println("Subtotal         " + (int)subtotal);
        System.out.println("Shipping         " + (int)shippingFee);
        System.out.println("Amount           " + (int)total);
        System.out.println("Customer Balance " + (int)balance);
        System.out.println("END.");
    }
    
}
