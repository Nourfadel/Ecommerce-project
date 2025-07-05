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
public class ExpirableProduct extends Product{
    
    private LocalDate dateOfExpire;
    
    
    public ExpirableProduct(String name, double price, int quantity, LocalDate dateOfExpire ) {
        super(name, price, quantity);
        this.dateOfExpire = dateOfExpire;
       
    }
    
    @Override
    public boolean isExpiered(){
        return LocalDate.now().isAfter(dateOfExpire);
    }
    
    
}
