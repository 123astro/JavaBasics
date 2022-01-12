package com.careerdevs;

import java.text.DecimalFormat;

public class Car {
    private String make;
    private String model;
    private int mileage;
    private float gasTankPercent;

    public Car(String model, String make, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }

    public String getMake() {
        return make;
    }

    private void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    private void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public float getGasTankPercent() {
        return gasTankPercent;
    }

    private void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }

    @Override
    public String toString() {
        DecimalFormat decFormat = new DecimalFormat("#%");
        return "Make: " + getMake() + " Model: " + getModel() + " Mileage: " + getMileage() + " Gas left: " + decFormat.format(getGasTankPercent());
    }


}
