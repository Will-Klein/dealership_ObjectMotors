public abstract class Vehicle {
    private String plate;
    private String brand;
    private String model;
    private String color;
    private int year;
    private int hp;            //horse power
    private int mileage;
    private Owner owner;
    private Status status;

    public Vehicle (String plate, String brand, String model, String color, int year, int hp, int mileage, Owner owner, Status status) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.hp = hp;
        this.mileage = mileage;
        this.owner = owner;
        this.status = status;
    }

    //fzer método get status
}
