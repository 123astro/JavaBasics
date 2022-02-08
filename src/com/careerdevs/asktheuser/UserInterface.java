package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

       // carType();

        System.out.println("What type of car do you have?");
        String carType = scanner.nextLine();
        System.out.println("I have a " + carType + ".\n");

        System.out.println("How many cylinders does your " + carType + " have ?");
        byte cylinders = scanner.nextByte();
        System.out.println("My " + carType + " has " + cylinders + " cylinders.\n");

        System.out.println("The " + carType + "'s" + " speedometer goes to what speed?");
        short speedometer = scanner.nextShort();
        System.out.println("The " + carType + " has a speedometer that reads " + speedometer + "\n");

        System.out.println("How many mile warranty is on the " + carType);
        int mileWarranty = scanner.nextInt();
        System.out.println("The " + carType + " has a " + mileWarranty + " mile warranty.\n");

        System.out.println("How much did the " + carType + " cost?");
        float carCost = scanner.nextFloat();
        System.out.println("The " + carType + " cost : " + carCost + "\n");

        System.out.println("How many vehicles has " + carType + " sold since the start of the company?");
        long carsSold = scanner.nextLong();
        System.out.println(carType + " has sold " + carsSold + " vehicles lifetime.\n");

        System.out.println("What is the cubic capacity of the " + carType + "?");
        double cubicCap = scanner.nextDouble();
        System.out.println("The " + carType + " has a cubic capacity of " + cubicCap + "\n");

        System.out.println("Do you believe the " + carType + " is a good buy?");
        boolean goodBuy = scanner.nextBoolean();
        System.out.println("The " + carType + " is a good buy ? " + goodBuy + "\n");


    }

    public static void carType() {
        System.out.println("What type of car do you have?");
        String carType = scanner.nextLine();
        System.out.println("I have a " + carType + ".\n");
    }
}
