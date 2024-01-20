import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Pet> availablePets;    // This list will contain the pets that are available in the pet shop
    private List<Customer> customers;   // This list will contain the customers of the pet shop

    public PetShop(){   // Constructor
        this.availablePets = new ArrayList<>();    // Initialize the lists
        this.customers = new ArrayList<>();    // Initialize the lists
    }
    
    public void addPet(Pet pet){    // This method is called when we add a pet to the pet shop
        availablePets.add(pet); 
    }

    public void addCustomer(Customer customer){   // This method is called when we add a customer to the pet shop
        customers.add(customer);
    }

    public void sellPet(Customer customer, Pet pet){    // This method is called when we sell a pet to a customer
        if(availablePets.contains(pet)){    // Check if the pet is available
            customer.purchasePet(pet);
            availablePets.remove(pet);
            System.out.println(customer.getName() + " purchased "+ pet.getName() +  " for " + pet.getPrice() + "$");
        }
        else{
            System.out.println("Sorry, " + pet.getName() + " is not available.");
        }
    }

    public void displayAvailablePets(){     // This method is called when we display the available pets
        System.out.println("Available pets: ");
        for(Pet pet: availablePets){        
            System.out.println(pet);    
        }
    }

    public void displayCustomers(){    // This method is called when we display the customers
        System.out.println("Customers: \n----------------");
        for(Customer customer: customers){
            System.out.println(customer);
            System.out.println("----------------");
        }
    }
}
