public class Pet{
    private String name;    // The name of the pet
    private String species; // The species of the pet
    private int price;  // The price of the pet

    public Pet(String name, String species, int price){ // Constructor
        this.name = name;   // this.name refers to the name of the object that we are creating
        this.species = species; // this.species refers to the species of the object that we are creating
        this.price = price; // this.price refers to the price of the object that we are creating
    }

    public String getName(){    // Getter
        return name;
    }

    public String getSpecies(){     // Getter
        return species;
    }

    public int getPrice(){    // Getter
        return price;
    }

    public String toString(){   // This method is called when we print a Pet object (System.out.println(pet);)
        return name + " (" + species + ") - " + price + "$";    

    }

}