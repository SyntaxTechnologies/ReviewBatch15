package com.syntax.review12;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        String name="!Batch 15 is SMART";
        try{
            System.out.println(name.charAt(-1));
        }catch (StringIndexOutOfBoundsException e){
            /*
            printStackTrace
            provides us all the information to find and fix the issue
            as a tester you will always use
             */
           // e.printStackTrace();
            /*
            if we are interested in only the message we can use getMessage method
             */
           // System.out.println(e.getMessage());
/*
e will print the complete information about the exception class plus the message
 */
            System.out.println(e);
        }catch (NullPointerException npe){
            System.out.println(npe.getMessage());

        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("rest of the program");
    }
}
