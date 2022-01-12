package com.careerdevs.sayhello;

import com.careerdevs.NameGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        whatIsYourName();
        whatIsYourFullName();


    }

    public static void whatIsYourName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
            String name = scanner.next();
        System.out.println("Hello, nice to meet you " + name + ".");
    }

    public static void whatIsYourFullName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String firstName = scanner.next();
        System.out.println("What is your last name? ");
        String lastName = scanner.next();
        NameGenerator.generateFullName(firstName, lastName);
    }
}