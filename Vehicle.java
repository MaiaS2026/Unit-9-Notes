/* Vehicle is a SUPERCLASS (PARENT) */
public class Vehicle {
    // 1. INSTANCE VARIABLES 
    private int numWheels;
    private double avgSpeed;
    private String color; 

    // 2. CONSTRUCTORS
    // Methods to INITIALIZE all variable
    public Vehicle() {
        this.numWheels = 4;
        this.avgSpeed = 60;
        this.color = "White";
    }
    public Vehicle(int numWheels, double avgSpeed, String color) {
        // INITIALIZE to passed arguments
        this.numWheels = numWheels;
        this.avgSpeed = avgSpeed;
        this.color = color; 
    }
}