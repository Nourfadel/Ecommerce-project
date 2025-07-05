/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Logo
 */
public class Cart {
    
    private Map<Product, Integer> items = new LinkedHashMap<>();
    
    public void addProduct(Product product, int quantity){
        if (product.isExpiered()) {
            throw new IllegalArgumentException(product.getName() + "is expired");
        }
        if (quantity > product.quantity) {
            throw new IllegalArgumentException("current quantity not enough we have in stock:" + product.quantity);    
        }
        
        items.put(product, items.getOrDefault(product, 0)+quantity);
 
    }
    
    
    public boolean isEmpty(){
        return items.isEmpty();
    }
    
    
    public double getSubtotal(){
        double total = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
    
    
    
    public List<Shippable> getShippableItems() {
        List<Shippable> result = new ArrayList<>();
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product p = entry.getKey();
            int count = entry.getValue();
            if (p instanceof Shippable) {
                for (int i = 0; i < count; i++) {
                    result.add((Shippable) p);
                }
            }
        }
        return result;
    }

    public Map<Product, Integer> getItems() {
        return items;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
