import java.util.Hashtable;

public class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;
    private String address;

    public Warehouse(String address) {
        this.stock = new Hashtable<>();
        this.address = address;
    }

    public void stockItem(String sku, int quantity) {
        stock.put(sku, quantity);
    }

    @Override
    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            if (stock.containsKey(item.sku) && stock.get(item.sku) > 0) {
                this.stock.replace(item.sku, stock.get(item.sku) - 1);
                System.out.println("Item " + item.sku + " shipped from " + address);
            } else {
                System.out.println("Item " + item.sku + " not in stock at " + address);
            }
        }
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.sku))
            return stock.get(item.sku).intValue();
        return 0;
    }
}
