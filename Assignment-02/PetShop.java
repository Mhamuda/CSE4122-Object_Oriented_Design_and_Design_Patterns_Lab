import java.util.ArrayList;
import java.util.List;

class PetShop {

    private List<Pet> availaPets;
    private List<Customer> customers;

    public PetShop() {
        this.availaPets = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        availaPets.add(pet);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void sellPet(Customer customer, Pet pet) {
        if (availaPets.contains(pet)) {
            customer.purchasePet(pet);
            availaPets.remove(pet);
            System.out.println(customer.getName() + " purchased " + pet.getName() + " for " + pet.getPrice() + "$");
        } else {
            System.out.println("Sorry " + pet.getName() + " is not available.");
        }
    }

    public void displayAvailablePets() {
        System.out.println("Available pets: ");
        for (Pet pet : availaPets) {
            System.out.println(pet);
        }
    }

    public void displayCustomers() {
        System.out.println("Customers: \n---------------");
        for (Customer customer : customers) {
            System.out.println(customer);
            System.out.println("----------------");
        }
    }
}