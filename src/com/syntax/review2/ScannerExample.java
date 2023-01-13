package com.syntax.review2;


import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        int num=10;
        num=11;

        //non prim  variable = scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter you age");
        int age=keyboard.nextInt(); //to capture int val ues

        System.out.println("Are you tired");
        boolean tired=keyboard.nextBoolean(); //to capture boolean values

        System.out.println("What is your name");
        String name=keyboard.next(); // to capture String until space

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);
    }
}
