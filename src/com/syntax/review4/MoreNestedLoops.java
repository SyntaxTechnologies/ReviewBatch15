package com.syntax.review4;

public class MoreNestedLoops {

    public static void main(String[] args) {

        //what is the output

        for(int i=1; i<=3; i++){

            for(int j=1; j<=4; j++){
                System.out.println("Hello");
            }
            System.out.println("Bye");
            break;
        }

        System.out.println(" ----  what is the output ---- ");

        for(int i=1; i<=3; i++){

            for(int j=1; j<=4; j++){
                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");
        }

        System.out.println(" ----  what is the output ---- ");

        for(int i=1; i<=3; i++){

            for(int j=1; j<=4; j++){
                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");
            break;
        }

        System.out.println(" ----  what is the output ---- ");

        for(int i=1; i<=3; i++){

            for(int j=1; j<=4; j++){

                if(j<2) {
                    continue;
                }
                System.out.println("Hello");
            }
            System.out.println("Bye");
        }
    }
}
