public class Main {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();    // Create a new PetShop object

        Pet cat = new Pet("Kitty", "Cat", 500); // Create a new Pet object
        Pet dog = new Pet("Max", "Dog", 400);   // Create a new Pet object
        Pet bird = new Pet("Jasper", "Bird", 600);  // Create a new Pet object

        Customer customer1 = new Customer("Mikel");   // Create a new Customer object
        Customer customer2 = new Customer("Olivia");    // Create a new Customer object
        Customer customer3 = new Customer("Emily");   // Create a new Customer object

        petShop.addPet(cat);    // Add the cat to the pet shop
        petShop.addPet(dog);    // Add the dog to the pet shop
        petShop.addPet(bird);   // Add the bird to the pet shop

        petShop.addCustomer(customer1); // Add the customer1 to the pet shop
        petShop.addCustomer(customer2); // Add the customer2 to the pet shop
        petShop.addCustomer(customer3); // Add the customer3 to the pet shop

        petShop.displayAvailablePets(); // Display the available pets

        petShop.sellPet(customer1, cat);    // Sell the cat to the customer1
        petShop.sellPet(customer2, dog);    // Sell the dog to the customer2
        petShop.sellPet(customer3, bird);   // Sell the bird to the customer3

        petShop.displayCustomers(); // Display the customers

    }   
}
