package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        int km;
        int age;

        double priceKms;
        double singleKmPrice = 0.21;
        double underAgeDiscount = 20;
        double overSixtyFiveDiscount = 40;
        double finalPrice;

        Scanner in = new Scanner(System.in);

        System.out.println("How many km do you have to travel?");
        km = Integer.parseInt(in.nextLine());

        System.out.println("How old are you?");
        age = Integer.parseInt(in.nextLine());

        priceKms = km * singleKmPrice;

        if (age < 18) {
            finalPrice = priceKms * underAgeDiscount / 100;
        } else if (age >= 65) {
            finalPrice = priceKms * overSixtyFiveDiscount / 100;
        }else {
            finalPrice = priceKms;
        }

        System.out.println("Age " + age);
        System.out.println("Final Price €" + finalPrice);

    }
}
