package com.syntax.review4;

public class MoreLoops {

    public static void main(String[] args) {

        //what is the output?
        for (int i = 0; i <= 3; i++) {
            System.out.println(i); //0 1 2 3
            for (int j = 1; j >= 3; j++) {
                System.out.println(j);
            }
        }

        System.out.println(" ----------  ");

        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println(" ---- CAR------  ");

        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {

                        System.out.println(a + " " + b + " " + c + " " + d);
                    }
                }
            }
        }

        //HW create a digital clock
        // it should start printing 00:00 and end 23:59
    }
}
