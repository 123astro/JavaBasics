package com.careerdevs;

public class Person {
   public String firstName;
   public String lastName;
  // public boolean human;
  // public int age;
    public int yearOfBirth;



    public Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

  public String getFullName() {
        return firstName + " " + lastName;
  }

  public int getAge(int currentYear){
        return currentYear - yearOfBirth;
  }

  public void sayHello() {
      System.out.println("Hello, my name is " + getFullName());
  }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
