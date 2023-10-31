package baitap;

// Abstract class Vehicle
public abstract class Vehicle {

    protected String color;
    protected int speed;

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public abstract void go();

    public void changeColor(String newColor) {
        this.color = newColor;
    }

}

class Bicycle extends Vehicle {

    private int numberOfWheels;

    // Constructor
    public Bicycle(String color, int speed, int numberOfWheels) {
        super(color, speed);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void go() {
        System.out.println("The " + color + " bicycle with " + numberOfWheels + " wheels goes at " + speed + " km/h");
    }

   
}


class Car extends Vehicle {

    private int sizeOfEngine;
    private int numberOfDoors;

    // Constructor
    public Car(String color, int speed, int sizeOfEngine, int numberOfDoors) {
        super(color, speed);
        this.sizeOfEngine = sizeOfEngine;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void go() {
        System.out.println("The " + color + " car with " + numberOfDoors + " doors and " + sizeOfEngine + " engine size goes at " + speed + " km/h");
    }
}
