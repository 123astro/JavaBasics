package com.careerdevs.programminglanguagefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter programming language\nInput: ");
        String programmingLanguageInput = scanner.nextLine();
        System.out.print("Is object oriented\nInput(true/false): ");
        boolean isObjectOriented = scanner.nextBoolean();
        System.out.print("Enter file extension\nInput: ");
        String fileExtensionInput = scanner.next();
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(programmingLanguageInput, isObjectOriented,
                fileExtensionInput);
        System.out.println(programmingLanguage);
    }
}
