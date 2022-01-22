package com.careerdevs.countryfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country name\nInput: ");
        String nameInput = scanner.nextLine();
        System.out.print("Enter population\nInput: ");
        long populationInput = scanner.nextLong();
        System.out.print("Enter capital?\nInput: ");
        String capitalInput = scanner.next();
        Country country = new Country(nameInput, populationInput, capitalInput);
        System.out.println(country);
    }
}
