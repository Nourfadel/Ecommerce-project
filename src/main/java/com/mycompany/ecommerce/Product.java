/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author Logo
 */
public class Product {
    
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    // function to check if the product is expiered or not
    public boolean isExpiered(){
        return false;
    }
    
    
    // function to check if we have enough amount of product
    public void decreaseQuantity(int amount){
        if (amount <= quantity) {
            quantity -= amount;
        }else{
            throw new IllegalArgumentException("Not enough quantity in stock");
        }
    }
    
}
