package com.Ejercicio5;

public class Coche {

    // Attributes

    int numDoors;
    String brand;
    String color;
    boolean sport;
    String door;

    // Constructors
    public Coche(){

    }

    public Coche(int numDoors, String brand, String color, boolean sport) {
        this.numDoors = numDoors;
        this.brand = brand;
        this.color = color;
        this.sport = sport;
    }
// Methods

    public void openDoor(String message){
        door = message;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "numDoors=" + numDoors +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", sport=" + sport +
                '}';
    }
}
