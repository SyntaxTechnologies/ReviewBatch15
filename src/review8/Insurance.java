package review8;

public abstract class Insurance {

    //Can I have variables inside abstract class -Yes
    public static String company="Geico";
    protected String policyNumber;
    String policyHolder;

    //Can I have constructor inside abstract class -Yes
    public Insurance(String policyNumber, String policyHolder){
        this.policyNumber=policyNumber;
        this.policyHolder=policyHolder;
    }

    public void getInsurance(){
        System.out.println("We need to get insurance");
    }

    public abstract double calculateCoverage();
}

class CarPolicy extends Insurance {

    double premium;
    int age;

    CarPolicy (String policyNumber, String policyHolder, double premium, int age){
        super(policyNumber, policyHolder);
        this.premium=premium;
        this.age=age;
    }

    //to provide implementation we need to follow rules of overriding
    public double calculateCoverage(){

        if (age<20) {
            return premium*2;
        }else if(age <40){
            return premium*0.5;
        }else {
            return premium*0.2;
        }
    }
}

class PetPolicy extends Insurance {

    int numberOfPets;
    double premium;

    PetPolicy(String policyNumber, String policyHolder, double premium, int numberOfPets){
        super(policyNumber, policyHolder);
        this.premium=premium;
        this.numberOfPets=numberOfPets;
    }

   public double calculateCoverage(){

        if(numberOfPets>2){
            return premium*2;
        }else if (numberOfPets>5){
            return premium*3;
        }else {
            return premium*5;
        }
   }

}