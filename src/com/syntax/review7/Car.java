package com.syntax.review7;

public class Car {

    String make, model;
    int year, horsePower;

    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    public Car(String make, String model, int year, int horsePower) {
        this(make,model); //making call to the current class constructor
        this.year=year; //accessing current class instance variables
        this.horsePower=horsePower;
    }

    public void start(){
        System.out.println(make+" starts");
    }

    public void drive(int speed){
        System.out.println(make+" drives with speed "+speed);
    }

    //SAME class have 2 or more methods with same name = Method Overloading
    /*How to implement?
            1. by using different number of the parameters
            2. by using different type of the parameters
            3. sequence
     */
    void drive(String destination) {
        System.out.println(make+" drives to "+destination);
    }

    void drive(int speed, String destination){
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }

    void drive(String destination, int speed){
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }
}
