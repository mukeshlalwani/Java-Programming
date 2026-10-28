package org.example;

public class assignment {
    static void main() {
        int newValue = 50;

        if (newValue == 50) {
            System.out.println("this is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("this is not supposed to happen");
        }

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValueTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal : " + myValueTotal);
        double theRemainder = myValueTotal % 40.00d;
        System.out.println("Remainder : " + theRemainder);
        boolean isNoReminder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder : " + isNoReminder);

        if (!isNoReminder) {
            System.out.println("Got Some remainder");
        }
    }
}
