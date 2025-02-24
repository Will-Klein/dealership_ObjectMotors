public class Motorcycle extends Vehicle {
    private boolean chest;
    private int cylinders;


    public Motorcycle(String plate, String brand, String model, String color, int year, int hp, int mileage, Owner owner, Status status, boolean chest, int cylinders) {
        super(plate, brand, model, color, year, hp, mileage, owner, status);
        this.chest = chest;
        this.cylinders = cylinders;
    }
}
