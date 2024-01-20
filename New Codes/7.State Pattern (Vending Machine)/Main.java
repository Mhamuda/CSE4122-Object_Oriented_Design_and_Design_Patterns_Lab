public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.dispense();
        vendingMachine.ejectMoney();
        System.out.println("Number of available products: "+ vendingMachine.getCount());

        vendingMachine.insertDollar();
        vendingMachine.insertDollar();
        vendingMachine.dispense();
        vendingMachine.dispense();
        System.out.println("Number of available products: "+ vendingMachine.getCount());
        
        vendingMachine.insertDollar();
        vendingMachine.dispense();
    }
    
}
