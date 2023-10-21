/*
 * This code demonstrates the Proxy Design Pattern in the context of online retail. 
 * It uses a proxy class, OrderFulfillment, to efficiently handle the global distribution of customer orders across multiple warehouses. 
 * This approach ensures that products are available and delivered smoothly, enhancing the overall shopping experience for customers.
 */


import java.util.List;

public class ProxyPatternExample {
    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse("Warehouse 1");
        Warehouse warehouse2 = new Warehouse("Warehouse 2");

        warehouse1.stockItem("SKU1", 5);
        warehouse2.stockItem("SKU2", 10);

        List<Warehouse> warehouses = List.of(warehouse1, warehouse2);

        OrderFulfillment orderFulfillmentProxy = new OrderFulfillment(warehouses);

        List<Item> itemList = List.of(new Item("SKU1"), new Item("SKU2"), new Item("SKU3"));
        Order order = new Order(itemList);

        orderFulfillmentProxy.fulfillOrder(order);

    }
}
