package com.syntax.review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowKeyword {
    public static void main(String[] args) {

        throwDemo();



    }

   static void throwDemo(){
        throw new NullPointerException();
    }
}
