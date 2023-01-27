package com.syntax.review5;

public class Task8 {

    // Write a Java Program to print the first 10 numbers of Fibonacci series.

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;

        for(int i=1; i<=10; i++){

            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }

}
