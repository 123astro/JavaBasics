package com.careerdevs.carfactory;

public class Car {
    public String make;
    public String model;
    public int mileage;
    public float gasTankPercent;


    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", gasTankPercent=" + gasTankPercent +
                '}';
    }
}
