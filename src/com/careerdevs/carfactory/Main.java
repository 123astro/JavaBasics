package com.careerdevs.carfactory;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createACar("BMW", "X5", "Keith");
        createACarObject();

    }

    public static void createACar(String makeInput, String modelInput, String ownerInput) {
        System.out.println(ownerInput + " owns a car called " + makeInput + " " + modelInput);
    }

    public static void createACarObject() {
        System.out.print("Enter car make: ");
        String makeInput = scanner.nextLine();
        System.out.print("Enter car model: ");
        String modelInput = scanner.nextLine();
        System.out.print("Enter car mileage: ");
        int mileageInput = scanner.nextInt();
        System.out.print("Enter the amount of gas left(float): ");
        float gasTankPercentage = scanner.nextFloat();
        Car car = new Car(makeInput, modelInput, mileageInput, gasTankPercentage);
        System.out.println(car);
    }
}
