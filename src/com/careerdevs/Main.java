package com.careerdevs;

import jdk.swing.interop.SwingInterOpUtils;

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

        for (int i = 0; i < People.firstNames.length; i++) {
            // System.out.println(People.firstNames[i]);
            String fName = People.firstNames[i];
            String lName = People.lastNames[i];
            Person tempPerson = new Person(fName, lName);

            //add the new Person to the array of Persons
            allPeople[i] = tempPerson;
            tempPerson.sayHello();


        }
        System.out.println(Arrays.toString(allPeople));


        // CARS PART 1
        System.out.println("\nPart 1 of Car Basic challenge\n");
        Car car1 = new Car("Camaro 2ss", "Chevy", 10000, (float) .10);
        Car car2 = new Car("Mustang GT", "Ford", 30000, (float) .50);
        Car car3 = new Car("Hellcat", "Dodge", 100, (float) .90);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // CARS PART 2

        System.out.println("\nPart 2 of Car Basic challenge\n");
        ArrayList<Car> listOfCars = new ArrayList<>();

        listOfCars.add(new Car("Camaro 2ss", "Chevy", 10000, (float) .10));
        listOfCars.add(new Car("Mustang GT", "Ford", 30000, (float) .50));
        listOfCars.add(new Car("Hellcat", "Dodge", 100, (float) .90));
        for (Car car : listOfCars) {  // for in loop or for each loop
            System.out.println("Car: " + car.getModel() + " Make: " + car.getMake() + " Mileage: " + car.getMileage() + " Gas left: " + car.getGasTankPercent());
        }

        //for each loop
        // it is an enhanced for loop = . was introduced in JDK 1.5
        //for (type var : array)
        //{
        //    statements using var;
        //}
        // the draw backs
        //For-each loops are not appropriate when you want to modify the array:
        // For-each also has some performance overhead over simple iteration:
        // For-each cannot process two decision making statements at once
        // For-each only iterates forward over the array in single steps -- sequential only
        // For-each loops do not keep track of index. So we can not obtain array index using For-Each loop

    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
        // System.out.println(firstName + " " + lastName);
    }

}
