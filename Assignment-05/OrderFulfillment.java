import java.util.ArrayList;
import java.util.List;

public class OrderFulfillment implements IOrder {
    private List<Warehouse> warehouses;

    public OrderFulfillment(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    @Override
    public void fulfillOrder(Order order) {
        List<Order> warehouseOrders = new ArrayList<>();

        for (Item item : order.itemList) {
            boolean itemFulfilled = false;

            for (Warehouse warehouse : warehouses) {
                if (warehouse.currentInventory(item) > 0) {
                    Order warehousOrder = new Order(List.of(item));
                    warehouse.fulfillOrder(warehousOrder);
                    warehouseOrders.add(warehousOrder);
                    itemFulfilled = true;
                    break;
                }
            }

            if (!itemFulfilled) {
                System.out.println("Item " + item.sku + " not in stock globally.");
            }
        }
        return;
    }
}
