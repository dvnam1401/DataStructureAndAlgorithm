package baitap;

import java.util.Scanner;
public class VehicleList {
    private int n;
    private Vehicle[] vehicles;

    // Constructor
    public VehicleList(int size) {
        this.n = size;
        this.vehicles = new Vehicle[n];
    }

    // Input method to let user populate the list of vehicles
    public void input() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter vehicle type (1 for Bicycle, 2 for Car): ");
            int choice = scanner.nextInt();
            System.out.println("Enter color: ");
            String color = scanner.next();
            System.out.println("Enter speed: ");
            int speed = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter number of wheels: ");
                int numberOfWheels = scanner.nextInt();
                vehicles[i] = new Bicycle(color, speed, numberOfWheels);
            } else if (choice == 2) {
                System.out.println("Enter size of engine: ");
                int sizeOfEngine = scanner.nextInt();
                System.out.println("Enter number of doors: ");
                int numberOfDoors = scanner.nextInt();
                vehicles[i] = new Car(color, speed, sizeOfEngine, numberOfDoors);
            } else {
                System.out.println("Invalid choice!");
                i--; // Ask again for the current vehicle details
            }
        }
    }

    // Output method to display the list of vehicles
    public void output() {
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }

    // Method to display the slowest vehicle's speed
    public void safetyVehicle() {
        int slowestSpeed = Integer.MAX_VALUE;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.speed < slowestSpeed) {
                slowestSpeed = vehicle.speed;
            }
        }
        System.out.println("The slowest speed in the list is: " + slowestSpeed + " km/h");
    }

    // Main method to test the methods of this class
    public static void main(String[] args) {
        System.out.println("Enter number of vehicles: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        VehicleList vehicleList = new VehicleList(n);

        vehicleList.input();
        vehicleList.output();
        vehicleList.safetyVehicle();
    }
}
