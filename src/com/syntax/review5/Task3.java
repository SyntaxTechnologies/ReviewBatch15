package com.syntax.review5;

public class Task3 {

    public static void main(String[] args) {

        int[][] numbers={
                {1,2,3}, //0
                {11,12}, //1
                {20,21,22}, //2
                {100,101} //3
        };

        int sum=0;
        for(int[] nums:numbers){
            for(int num:nums){
               sum+=num;
            }
        }

        System.out.println("Total ="+sum);
    }
}
