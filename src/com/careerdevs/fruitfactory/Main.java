package com.careerdevs.fruitfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        //ask questions
        System.out.print("Enter fruit name\nInput: ");
        String nameInput = scanner.nextLine();
        System.out.print("Enter color\nInput: ");
        String colorInput = scanner.nextLine();
        System.out.print("Does the fruit have seeds?\n(true/false): ");
        boolean hasSeedsInput = scanner.nextBoolean();

        //creating animal instance

        Fruit fruit = new Fruit(nameInput, colorInput, hasSeedsInput);

        //output field vales for animal instance
        System.out.println(fruit);
    }
}
