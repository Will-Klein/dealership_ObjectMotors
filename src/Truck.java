public class Truck extends Vehicle {
    private Double loadCapacity;       //in kg
    private int axles;                 //quantity


    public Truck(String plate, String brand, String model, String color, int year, int hp, int mileage, Owner owner, Status status, Double loadCapacity, int axles) {
        super(plate, brand, model, color, year, hp, mileage, owner, status);
        this.loadCapacity = loadCapacity;
        this.axles = axles;
    }
}
