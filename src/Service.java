public class Service {
    private boolean type;       // true- sale     false- maintenence
    private int price;
    private String date;
    private Vehicle vehicle;
    private Owner owner;

    public Service(boolean type, int price, String date, Vehicle vehicle, Owner owner) {
        this.type = type;
        this.price = price;
        this.date = date;
        this.vehicle = vehicle;
        this.owner = owner;
    }
}

