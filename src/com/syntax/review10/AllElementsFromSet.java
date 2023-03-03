package com.syntax.review10;

import java.util.*;

public class AllElementsFromSet {

    public static void main(String[] args) {

        Set<String> qaJobs=new LinkedHashSet<>(); //does not maintain the order
        //adding object/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        //how to get all values from a Set
        // 1 - enhanced for loop
        for(String qa:qaJobs){
            System.out.print(qa+"  ");
        }

        System.out.println(" ----------------------------    ");
        //2 - iterator -
        //Iterator Inteface has 3 methods: hasNext(), next(), remove();
        Iterator<String> it=qaJobs.iterator();

        while(it.hasNext()) {
            String element=it.next();
            System.out.print(element+"  ");
        }
    }
}
