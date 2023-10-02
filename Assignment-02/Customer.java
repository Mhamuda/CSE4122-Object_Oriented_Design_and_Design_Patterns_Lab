import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Pet> purchasedPets;

    public Customer(String name) {
        this.name = name;
        this.purchasedPets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Pet> getPurchasedPets() {
        return purchasedPets;
    }

    public void purchasePet(Pet pet) {
        purchasedPets.add(pet);
    }

    public String toString() {
        return "Customer: " + name + "\nPurchased Pets: " + purchasedPets;
    }
}
