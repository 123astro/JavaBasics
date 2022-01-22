package com.careerdevs.sayhello;

import com.careerdevs.NameGenerator;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        whatIsYourName("What is your first name");
        whatIsYourFullName("First prompt type your first name. Second prompt, type your last name");
        simpleCalculator();
        userSignUp();
    }

    public static void whatIsYourName(String question) {
        String userName = getUserInput(question);
        System.out.println("Hello, nice to meet you " + userName + ".\n");
    }

    public static void whatIsYourFullName(String question) {
        String firstName = getUserInput(question);
        String lastName = getUserInput(question = "");
        NameGenerator.generateFullName(firstName, lastName);
    }

    public static void userSignUp() {
        String userName = getUserInput("Enter a username"); // invoking getUserInput
        String passWord = getUserInput("Enter a password");
        System.out.println("Thanks for signing up " + userName);
        if (passWord.length() < 5) {
            System.out.println("Your password isn't very good!");
        }
    }

    public static String getUserInput(String question) {
        System.out.print(question + "\nInput: ");
        String input = scanner.next();
        return input;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void simpleCalculator() {
        int inputNum1 = getUserIntInput("Enter first number to add");
        int inputNum2 = getUserIntInput("Enter second number to add");

        int sumTotal = sum(inputNum1, inputNum2);

        System.out.println("The sum of " + inputNum1 + " and " + inputNum2 + " is " + sumTotal + "\n");
    }

    public static int getUserIntInput(String question) {
        System.out.println((question + "\nInt: "));
        while (!scanner.hasNextInt()) {  // loop while scanner is not a number
            System.out.println("Not a number. Enter a valid number");
            scanner.next();
        }
        return scanner.nextInt();
    }
}

