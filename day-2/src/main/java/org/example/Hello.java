package org.example;

public class Hello {
    static void main(String[] args) {
        System.out.println("Hello, Tim");
//        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
           // System.out.println("And i am scared of aliens");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater than second top score and less than 100");
        }

        if((topScore > 90)  || (secondTopScore <= 90)) {
            System.out.println("Either or both of conditions are true");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
//        System.out.println("Make car : " + isDomestic);

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
        System.out.println("Our Client Is : " + ageText);
    }
}
