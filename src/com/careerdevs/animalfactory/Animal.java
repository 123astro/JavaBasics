package com.careerdevs.animalfactory;

public class Animal {
    //Fields species (string), legs (short) livesOnLand (boolean)
    public String species;
    public short legs;
    public boolean livesOnLand;

    public Animal(String species, short legs, boolean livesOnLand){
        this.species = species;
        this.legs = legs;
        this.livesOnLand = livesOnLand;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", legs=" + legs +
                ", livesOnLand=" + livesOnLand +
                '}';
    }
}
