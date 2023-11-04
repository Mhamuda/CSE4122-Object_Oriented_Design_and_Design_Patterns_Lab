/*
 * This code represents a vending machine using the State design pattern with different states for its behavior, like idle, having one dollar or being out of stock. 
 * The VendingMachine class manages state transitions and user interactions while the Main class tests its functionality.
 */

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.ejectMoney();

        vendingMachine.insertDollar();
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.dispense();

        vendingMachine.insertDollar();
        vendingMachine.dispense();

        vendingMachine.insertDollar();
        vendingMachine.dispense();

    }

}
