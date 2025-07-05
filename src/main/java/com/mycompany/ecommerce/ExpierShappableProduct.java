/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

import java.time.LocalDate;

/**
 *
 * @author Logo
 */
public class ExpierShappableProduct extends ExpirableProduct implements Shippable {
    
    private double weight;

     public ExpierShappableProduct(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        super(name, price, quantity, expiryDate);
        this.weight = weight;
    }   
     
     

    @Override
    public double getWeights() {
        return weight;
    }
    
}
