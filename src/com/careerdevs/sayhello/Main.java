package com.careerdevs.sayhello;

import com.careerdevs.NameGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        whatIsYourName("What is your first name");
        whatIsYourFullName("First prompt type your first name. Second prompt, type your last name");
        simpleCalculator();
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
            System.out.println("Your password sucks!");
        }
    }

    public static String getUserInput(String question) {
        System.out.print(question + "\nInput: ");
        String input = scanner.nextLine();
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
        int input = 0;
//        while (true) {
//            try{
//                input = scanner.nextInt();
//                break;
//            }
//            catch (InputMismatchException e) {
//                System.out.println("Please enter a valid number");
//                scanner.nextLine();
//            }
//        }
        return input;
//        while (!scanner.hasNextInt()) {
//            System.out.println("Please enter a number");
//            scanner.nextInt();
//        }
    }
}

