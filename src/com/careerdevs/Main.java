package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        String firstName = "Keith";
        String lastName = "Benjamin";
        createFullName(firstName, lastName);
        NameGenerator.generateFullName(firstName, lastName);
    }

    public static void createFullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

}
