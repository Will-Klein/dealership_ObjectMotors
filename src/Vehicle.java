public abstract class Vehicle {
    private String plate;
    private String brand;
    private String model;
    private String color;
    private int year;
    private int hp;            //horse power
    private int mileage;
    private double price;
    private Customer Customer;
    private Status status;

    public Vehicle (String plate, String brand, String model, String color, int year, int hp, int mileage, double price, Customer customer, Status status) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.hp = hp;
        this.mileage = mileage;
        this.price = price;
        this.Customer = customer;
        this.status = status;
    }

    public String getPlate(){
        return plate;
    }

    public Status getStatus(){
        return status;
    }

    public Customer getCustomer(){
        return Customer;
    }

    public Double getPrice(){
        return price;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }
}
