import java.util.HashMap;
import java.util.Map;

public class RealOnlineRetailStore implements OnlineRetailStore {
    private Map<String, Integer> warehouse;

    public RealOnlineRetailStore() {
        warehouse = new HashMap<>();
        warehouse.put("Laptop", 100);
        warehouse.put("Tablet", 70);
        warehouse.put("Smartphone", 50);
        warehouse.put("Mouse", 40);
    }

    @Override
    public void purchaseProduct(String product, int quantity) {
        if (warehouse.containsKey(product) && warehouse.get(product) >= quantity) {
            System.out.println(quantity + " units of " + product + " purchased.");
            warehouse.put(product, warehouse.get(product) - quantity);
        }
        else{
            System.out.println("Sorry, "+product+" is out of stock.");
        }
    }
}