import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectMotors {
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Customer> customers;
    private ArrayList<Service> services;

    public ObjectMotors() {
        vehicles = new ArrayList<>();
        customers = new ArrayList<>();
        services = new ArrayList<>();
    }

    //future update: more data verification

    /**
     * add vehicle to dealership (for sale or maintenence -> services available)
     * @param vehicle
     * @return true -> if the vehicle was added; false -> if the vehicle has not been added
     */
    public boolean addVehicle(Vehicle vehicle){
        if (validPlate(vehicle.getPlate())){
            for (Vehicle v : vehicles) {
                if (v.getPlate().equals(vehicle.getPlate())){
                    return false;
                }
            }
            vehicles.add(vehicle);
            return true;
        }
        return false;
    }

    /**
     * method to validate the plate of the vehicle to be add
     * @param plate
     * @return true -> if the license plate respect the format; false -> if the license plate does not respect
     * format: AAA1A11
     */
    private boolean validPlate(String plate){
        if (plate.length() != 7){
            return false;
        }
        for (int i=0; i<plate.length(); i++){
            if ((i <= 2 || i == 4) && !Character.isLetter(plate.charAt(i))){
                return false;
            }
            else if ((i == 3 || i > 4) && !Character.isDigit(plate.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * add customer to dealership
     * @param customer
     * @return true -> if the customer was added; false -> if the customer has not been added
     */
    public boolean addCustomer(Customer customer){
        if (customer.getCpf().length() != 11){
            return false;
        }
        for (Customer c : customers) {
            if (c.getCpf().equals(customer.getCpf())){
                return false;
            }
        }
        customers.add(customer);
        return true;
    }

    /**
     * add service to dealership
     * @param service
     * @return true -> if the service was added; false -> if the service has not been added
     */
    public boolean addService(Service service){
        for (Service s : services) {
            if (s.getId() == service.getId()){
                return false;
            }
        }
        services.add(service);
        return true;
    }

    public boolean removeVehicle(Vehicle vehicle){
        for (Vehicle v : vehicles) {
            if (v.getPlate().equals(vehicle.getPlate())){
                vehicles.remove(v);
                return true;
            }
        }
        return false;
    }

    public boolean removeCustomer(Customer customer){
        for (Customer c : customers) {
            if (c.getCpf().equals(customer.getCpf())){
                customers.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean removeService(Service service){
        for (Service s : services) {
            if (s.getId() == service.getId()){
                services.remove(s);
                return true;
            }
        }
        return false;
    }

    public Vehicle findVehicleByPlate (String plate) {
        return vehicles.stream()
                .filter(v -> v.getPlate().equals(plate))
                .findFirst()
                .orElse(null);
    }

    public List<Vehicle> findVehiclesByStatus (Status status){
        return vehicles.stream()
                .filter(v -> v.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<Vehicle> findVehiclesByCustomer(Customer customer){
        return vehicles.stream()
                .filter(v -> v.getCustomer().equals(customer))
                .collect(Collectors.toList());
    }

    public List<Vehicle> findVehiclesByPriceRange(double lower, double upper){
        return vehicles.stream()
                .filter (v -> v.getPrice() <= upper && v.getPrice() >= lower)
                .collect(Collectors.toList());
    }

    public List<Vehicle> findVehiclesByBrandOrModel(String bm){
        return vehicles.stream()
                .filter(v -> v.getBrand().equalsIgnoreCase(bm) || v.getModel().equalsIgnoreCase(bm))
                .collect(Collectors.toList());
    }

    public List<Vehicle> findVehiclesByYear(int year){
        return vehicles.stream()
                .filter(v -> v.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Vehicle> findVehiclesByMileage(int lower, int upper){
        return vehicles.stream()
                .filter(v -> v.getMileage() >= lower && v.getMileage() <= upper)
                .collect(Collectors.toList());
    }
}
