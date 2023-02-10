package com.syntax.review7;

//Tesla is a subclass of a Car
//Car class is a superclass of Tesla
public class Tesla extends Car{

    String type;
    boolean autoPilot;

    Tesla(String make, String model, int year, int horsePower, String type, boolean autoPilot){
        super(make, model, year, horsePower);
        this.type=type;
        this.autoPilot=autoPilot;
    }

    protected void haveAutopilot(){
        System.out.println(make+" have auto pilot "+autoPilot);
    }

    public void start(){

    }

    //Overriding - is when we have same method name in 2 DIFFERENT Class (Parent - Child)
    // In Overriding - INHERITANCE IS A MUST
    //In Overriding method signature should be SAME

    
}


