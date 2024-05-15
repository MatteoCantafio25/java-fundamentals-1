package org.lessons.java;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        String userName;

        String[] authorizedGuests = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        Scanner in = new Scanner(System.in);

        System.out.println("Give me your name please");
        userName = in.nextLine();

        boolean isFound = false;

        for (int i = 0; i < authorizedGuests.length; i++) {
            if (userName.equals(authorizedGuests[i])) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("I found you on the list, you're welcome to access to the event.");
        } else {
            System.out.println("You are not on the list you can step away from the queue.");
        }

        in.close();
    }
}
