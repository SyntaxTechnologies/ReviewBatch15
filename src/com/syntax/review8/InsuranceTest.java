package com.syntax.review8;

public class InsuranceTest {

    public static void main(String[] args) {

        //can I create an Object of Insurance Class - NO, since it is abstract

        Insurance carPolicy = new CarPolicy("I969696", "John Smith", 200, 22);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy = new PetPolicy("P986969", "Olena L", 20, 4);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());

        Insurance[] insurances={
                new CarPolicy("I969696", "John Smith", 200, 22),
                new CarPolicy("I969696", "John Smith", 200, 22),
                new PetPolicy("P986969", "Olena L", 10, 2),
                new CarPolicy("I969696", "John Smith", 200, 22),
        };

        insurances[0].calculateCoverage();

    }
}
