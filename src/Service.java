import java.time.LocalDate;

public class Service {
    private boolean type;       // true- sale     false- maintenence
    private String id;
    private double price;
    private LocalDate initialDate;
    private LocalDate endDate;
    private Vehicle vehicle;
    private Customer customer;

    public Service(boolean type, String id, double price, LocalDate initialDate, LocalDate endDate, Vehicle vehicle, Customer customer) {
        this.type = type;
        this.id = id;
        this.price = price;
        this.initialDate = initialDate;
        this.endDate = endDate;
        this.vehicle = vehicle;
        this.customer = customer;
    }

    public String getId(){
        return id;
    }

    public boolean getType(){
        return type;
    }

    public LocalDate getInitialDate(){
        return initialDate;
    }

    public LocalDate getEndDate(){
        return endDate;
    }

    public double getPrice(){
        return price;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public Customer getCustomer(){
        return customer;
    }
}

