package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // create scanner
        Scanner scanner = new Scanner(System.in);

        //ask questions
        System.out.print("Enter a Species\nInput: ");
        String speciesInput = scanner.nextLine();
        System.out.print("Enter the number of legs\nInput(short): ");
        short legInput = scanner.nextShort();
        System.out.print("Does the animal live on land?\n(true/false): ");
        boolean livesOnLandInput = scanner.nextBoolean();

        //creating animal instance

        Animal animal = new Animal(speciesInput, legInput, livesOnLandInput);

        //output field vales for animal instance
        System.out.println(animal);
    }
}
