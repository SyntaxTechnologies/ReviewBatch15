package com.syntax.review1;

public class DataTypes {

    public static void main(String[] args) {

        /* Data Types in Java: 1. primitive and 2. non primitive

        Primitive datatypes: byte, short, float, int, long, double, boolean, char

        numeric:
            whole numbers: byte, short, int, long
            decimal numbers: float, double

        boolean: true or false
        char:
         */

        // dataType nameOfTheVariable = value;
        //datatypes for whole numbers
        byte num=127;
        short num1=10;
        int num2=1; //most used
        long num3=1000000987097097009l;

        //datatypes for decimal values
        float number=10.99F;
        double number1=100.89;

        //datatype to represent single character
        char money='$';
        char gender='m';

        //to represent yes or no
        boolean needBreak=true;
        boolean understandingJava=true;

        System.out.println(num1); //printing value inside variable num1=10
        System.out.println("num1"); // printing a String value=num1

        //create a variable and store value into it
        boolean hungry=false;
        System.out.println(hungry);

    }
}
