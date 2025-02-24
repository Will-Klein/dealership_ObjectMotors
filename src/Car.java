public class Car extends Vehicle {
    private int doors;      //quantity

    public Car(String plate, String brand, String model, String color, int year, int hp, int mileage, Customer customer, Status status, int doors) {
        super(plate, brand, model, color, year, hp, mileage, customer, status);
        this.doors = doors;
    }

}
