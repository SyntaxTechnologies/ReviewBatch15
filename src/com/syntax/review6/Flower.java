package com.syntax.review6;

public class Flower {

    static boolean pretty=true;
    //attributes, properties
    String color, name;
    int price;

    //behavior
    void smell(){

        System.out.println(name+" smells good");
    }

    void bloom(){

        System.out.println(name+" flower blooms");
    }

    void grow(){

        System.out.println(name+ " flower grows");
    }

}
