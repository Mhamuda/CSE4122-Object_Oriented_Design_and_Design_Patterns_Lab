/*
Here I am implementing a simple pet shop management system using Object-Oriented Programming (OOP) in Java,where customers can purchase pets.
Pets and customers are represented as classes with relevant attributes and methods.
The PetShop class manages the available pets and customers, providing methods to add pets, add customers, sell pets, and display information.
The Main class is used for the entry point, creating objects, performing operations, and testing the functionality of the Pet Shop Management System.
 */

public class Main {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();

        Pet cat = new Pet("Kitty", "Cat", 500);
        Pet dog = new Pet("Max", "Dog", 400);
        Pet bird = new Pet("Jasper", "Bird", 600);

        Customer customer1 = new Customer("Mikel");
        Customer customer2 = new Customer("Olivia");
        Customer customer3 = new Customer("Emily");

        petShop.addPet(cat);
        petShop.addPet(dog);
        petShop.addPet(bird);

        petShop.addCustomer(customer1);
        petShop.addCustomer(customer2);
        petShop.addCustomer(customer3);

        petShop.displayAvailablePets();

        petShop.sellPet(customer1, cat);
        petShop.sellPet(customer2, dog);
        petShop.sellPet(customer3, bird);

        petShop.displayCustomers();

    }
}
