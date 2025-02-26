import java.util.ArrayList;

public class Customer {
    private String name;
    private String cpf;
    private String phone;
    private String address;
    private String email;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, String cpf, String phone, String address, String email) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
        this.email = email;
        vehicles = new ArrayList<>();
    }

    public String getCpf(){
        return cpf;
    }

}
