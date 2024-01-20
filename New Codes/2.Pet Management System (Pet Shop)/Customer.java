import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;   // The name of the customer 
    private List<Pet>purchasedPets; // This list will contain the pets that the customer has purchased

    public Customer(String name){   // Constructor
        this.name = name;   // this.name refers to the name of the object that we are creating
        this.purchasedPets = new ArrayList<>(); // Initialize the list
    }   
    
    public String getName(){    // Getter
        return name;
    }

    public List<Pet> getPurchasedPets(){    // Getter
        return purchasedPets;
    }

    public void purchasePet(Pet pet){   // This method is called when we sell a pet to a customer
        purchasedPets.add(pet);
    }

    public String toString(){   // This method is called when we print a Customer object (System.out.println(customer);)
        return "Customer: " + name + "\nPurchased Pets: " + purchasedPets;
    }
}
