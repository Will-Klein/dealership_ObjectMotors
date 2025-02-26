import java.time.LocalDate;

public class Service {
    private boolean type;       // true- sale     false- maintenence
    private int id;
    private int price;
    private LocalDate date;
    private Vehicle vehicle;
    private Customer customer;

    public Service(boolean type, int id, int price, LocalDate date, Vehicle vehicle, Customer customer) {
        this.type = type;
        this.id = id;
        this.price = price;
        this.date = date;
        this.vehicle = vehicle;
        this.customer = customer;
    }

    public int getId(){
        return id;
    }
}

