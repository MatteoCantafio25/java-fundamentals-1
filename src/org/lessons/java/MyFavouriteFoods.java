package org.lessons.java;

public class MyFavouriteFoods {
    public static void main(String[] args) {
        String[] favouriteFoods = {"French fries", "Pizza", "Pasta", "Ice cream", "Steak", "Fish", "Banana"};

        // Lunghezza dell'array
        System.out.println("Foods length: " + favouriteFoods.length);

        // Miglior cibo
        System.out.println("Best food: " + favouriteFoods[0]);

        // Peggior cibo
        System.out.println("Worse food: " + favouriteFoods[favouriteFoods.length - 1]);

        // Cibo di mezzo
        System.out.println("Middle food: " + favouriteFoods[favouriteFoods.length / 2]);
    }
}
