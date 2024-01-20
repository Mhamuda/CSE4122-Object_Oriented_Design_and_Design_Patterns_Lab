public class OutOfStockState implements State{

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("No products available.Cannot accept money.");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return.");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
       System.out.println("Out of stock.No product to dispense.");
    }
    
}
