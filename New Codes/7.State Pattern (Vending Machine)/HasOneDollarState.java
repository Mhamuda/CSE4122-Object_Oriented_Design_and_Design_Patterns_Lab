public class HasOneDollarState implements State{

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Alreaqdy have one dollar.");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Return money.");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getIdleState()); 
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Releasing product.");
        
        if(vendingMachine.getCount() > 1){
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getIdleState());
        }
        else{
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getOutOfStock());
        }
    } 
}
