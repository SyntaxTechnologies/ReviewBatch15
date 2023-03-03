package com.syntax.review10;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Double> grocery=new HashMap<>();
        //to store values inside the map
        grocery.put("Milk",5.99); // K+V = Entry Object
        grocery.put("Eggs", 6.50);
        grocery.put("Bread", 2.99);
        grocery.put("Tea",4.99);
        grocery.put("Cucumber", 2.50);
        grocery.put("Eggs", 7.99);
        grocery.put("Tomato", 2.50);
        grocery.put(null, null);

        double teaPrice=grocery.get("Tea"); //Returns the value to which the specified key is mapped
        System.out.println(teaPrice);

        System.out.println(grocery);

        int size=grocery.size();
        System.out.println("Number of entry objects = "+size);

        Map<String, Double> lmap=new LinkedHashMap<>();
        lmap.put("Milk",5.99); // K+V = Entry Object
        lmap.put("Eggs", 6.50);
        lmap.put("Bread", 2.99);
        lmap.put("Tea",4.99);
        lmap.put("Cucumber", 2.50);
        lmap.put("Eggs", 7.99);
        lmap.put("Tomato", 2.50);

        System.out.println("Order is preserved "+ lmap);

        System.out.println("   ------------------------   ");
        Map<String, Double> tmap=new TreeMap<>();
        tmap.putAll(grocery);
        tmap.putAll(lmap);
        System.out.println("Size ="+tmap.size());
        System.out.println("Sorted Order "+tmap);

    }
}
