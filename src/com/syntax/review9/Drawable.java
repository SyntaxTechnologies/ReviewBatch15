package com.syntax.review9;

//collection of public static final variables and public abstract methods

public interface Drawable {
    String TOOL = "Pencil"; //by default it is public static final variable

    void draw(); // by default this method is public abstract

    //above is how Interface used to be before Java 8
    //after Java 8 static and default methods were added to the Interface
    default void print() {
        System.out.println("We are drawing object using " + TOOL);
    }

    static void erase() {
        System.out.println("All drawings are erasable");
    }
}

abstract class Shape {

    public String color;
    protected double width, length;

    Shape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public abstract double calculateArea();
}

class Rectangle extends Shape implements Drawable {

    Rectangle(String color, double length, double width){
        super(color, length, width);
    }

    public double calculateArea(){

        return length*width;
    }
    public void draw() {
        System.out.println("I am drawing rectangle");
    }
}

class Square implements Drawable {

    public void draw() {
        System.out.println("I am drawing Square");
    }

}
