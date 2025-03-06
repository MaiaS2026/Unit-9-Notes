/* Car is a SUBCLASS (CHILD)
 that INHERITS from a Vehicle
 "Car IS-A type of VEHICLE"
 */
public class Car extends Vehicle {
    // Attributes that are SPECIFIC
    // to a Car, but not all Vehicles
    private int numSeats;
    private String brand;

    // Constructors are NOT inherited!!!
    public Car() {
        super();
        this.numSeats = 5;
        this.brand = "Honda";
    }
    public Car(int numWheels, double avgSpeed, String color, int numSeats, String brand) {
        // Must call super() FIRST
        // before setting up other vars
        super(numWheels, avgSpeed, color);
        this.numSeats = numSeats;
        this.brand = brand;
    }
}