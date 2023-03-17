package com.syntax.review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SyntaxErrorExample1 {
    /*
    throws keyword is used to indicate that a method can throw an exception
     */
    public static void main(String[] args) throws FileNotFoundException {
method();

    }

    static void method() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("sdbfjhsd");
    }
}
