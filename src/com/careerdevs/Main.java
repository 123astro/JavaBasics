package com.careerdevs;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String firstName = "Keith";
        String lastName = "Benjamin";
       // String fullName = firstName + " " + lastName;
       // System.out.println(fullName);
       // createFullName(firstName, lastName);
        //NameGenerator.generateFullName(firstName, lastName);
        String createdName = createFullName(firstName, lastName);
        System.out.println(createdName);

        Person myPerson = new Person(firstName, lastName);

        System.out.println(myPerson.firstName);
        System.out.println(myPerson.getFullName());
        myPerson.sayHello();

        //traditional arrays
        Person[] allPeople = new Person[People.firstNames.length];

        //array list
        ArrayList<Person> listOfPeople = new ArrayList<>();

        for (int i = 0; i < People.firstNames.length; i++){
           // System.out.println(People.firstNames[i]);
            String fName = People.firstNames[i];
            String lName = People.lastNames[i];
            Person tempPerson = new Person(fName, lName);

            //add the new Person to the array of Persons
            allPeople[i] = tempPerson;
            tempPerson.sayHello();
        }

        System.out.println(Arrays.toString(allPeople));
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
       // System.out.println(firstName + " " + lastName);
    }
}
