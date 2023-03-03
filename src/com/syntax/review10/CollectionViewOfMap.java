package com.syntax.review10;

import java.util.*;

public class CollectionViewOfMap {

    public static void main(String[] args) {

        Map<String, Double> lmap=new LinkedHashMap<>();
        lmap.put("Milk",5.99); // K+V = Entry Object
        lmap.put("Eggs", 6.50);
        lmap.put("Bread", 2.99);
        lmap.put("Tea",4.99);
        lmap.put("Cucumber", 2.50);
        lmap.put("Eggs", 7.99);
        lmap.put("Tomato", 2.50);

        Set<String> keys=lmap.keySet();

        for(String key:keys){
            System.out.print(key+" = "+lmap.get(key));
        }

        System.out.println("   -------------------------  ");

        Iterator<String> iter=keys.iterator();
        while(iter.hasNext()){
            // how to print Key+Value??
            String k=iter.next();
            System.out.print(k+" == "+lmap.get(k));
        }
        System.out.println(" -------------------  ");

        Collection<Double> values=lmap.values();
        //print all values
        for(double val:values){
            System.out.print(val+"  ");
        }

    }
}
