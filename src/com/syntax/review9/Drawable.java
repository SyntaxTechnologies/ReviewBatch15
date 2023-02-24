package com.syntax.review9;

public interface Drawable {
    public static final String TOOL="Pencil";
    void draw(); // by default this method is public abstract

    //above is how Interface used to be before Java 8
    //after Java 8 static and default methods were added to the Interface

    default void print(){
        System.out.println("We are drawing object using "+TOOL);
    }

    static void erase(){
        System.out.println("All drawings are erasable");
    }
}

class Rectangle implements Drawable {

    public void draw(){
        System.out.println("I am drawing rectangle");
    }
}

class Square implements Drawable {

    public void draw(){
        System.out.println("I am drawing Square");
    }

}
