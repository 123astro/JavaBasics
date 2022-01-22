package com.careerdevs.fruitfactory;

public class Fruit {
    public String fruitName;
    public String fruitColor;
    public boolean hasSeeds;

    public Fruit(String fruitName, String fruitColor, boolean hasSeeds) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.hasSeeds = hasSeeds;

    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitColor='" + fruitColor + '\'' +
                ", hasSeeds=" + hasSeeds +
                '}';
    }
}
