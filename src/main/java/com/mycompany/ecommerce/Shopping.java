/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Logo
 */
public class Shopping {
    
    public static void ship(List<Shippable> items) {
        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        Map<String, Integer> counts = new LinkedHashMap<>();

        for (Shippable item : items) {
            counts.put(item.getName(), counts.getOrDefault(item.getName(), 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getValue() + "x " + entry.getKey());
        }

        for (Shippable item : items) {
            System.out.println((int)item.getWeights() + "g");
            totalWeight += item.getWeights();
        }

        System.out.printf("Total package weight %.1fkg\n", totalWeight / 1000.0);
    }
    
}
