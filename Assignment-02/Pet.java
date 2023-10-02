public class Pet {
    private String name;
    private String species;
    private int price;

    public Pet(String name, String species, int price) {
        this.name = name;
        this.species = species;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + " (" + species + ") - " + price + "$";
    }
}