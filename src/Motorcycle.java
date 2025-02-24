public class Motorcycle extends Vehicle {
    private boolean chest;
    private int cylinders;


    public Motorcycle(String plate, String brand, String model, String color, int year, int hp, int mileage, Customer customer, Status status, boolean chest, int cylinders) {
        super(plate, brand, model, color, year, hp, mileage, customer, status);
        this.chest = chest;
        this.cylinders = cylinders;
    }
}
