package com.syntax.review5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of countries: ");
        int numberCountries = scanner.nextInt();
        String[] countries = new String[numberCountries];
        System.out.println("Enter the name of the countries: ");

        for (int i = 0; i < numberCountries; i++) {
            countries[i] = scanner.next();
        }

        for (String country : countries) {
            switch (country) {
                case "Egypt":
                    System.out.println("The capital of " + country + " is" + " Cairo");
                    break;
                case "France":
                    System.out.println("The capital of " + country + " is" + " Paris");
                    break;
                case "USA":
                    System.out.println("The capital of " + country + " is" + " Washington,DC");
                    break;
                case "UAE":
                    System.out.println("The capital of " + country + " is" + " Abu Dhabi");
                    break;
                case "Germany":
                    System.out.println("The capital of " + country + " is" + " Berlin");
                    break;
                default:
                    System.out.println("The capital of " + country + " is" + " Unknown");
                    break;
            }
        }
    }
}
