public class VendingMachine {

    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;
    private State currenState;
    private int count;

    public VendingMachine(int count){
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();

        if(count>0){
            currenState = idleState;
            this.count = count;
        }
        else{
            currenState = outOfStockState;
            this.count = 0;
        }
    }

    public void insertDollar(){
        currenState.insertDollar(this);
    }

    public void ejectMoney(){
        currenState.ejectMoney(this);
    }

    public void dispense(){
        currenState.dispense(this);
    }

    public void doReturnMoney(){
        System.out.println("Money returned from vending machine.");
    }

    public void doReleaseProduct(){
        count--;
        System.out.println("Product released from vending machine.");  
    }

    public void setState(State state){
        currenState = state;
    }
    
    public State getIdleState(){
        return idleState;
    }

    public State getHasOneDollarState(){
        return hasOneDollarState;
    }

    public State getOutOfStock(){
        return outOfStockState;
    }

    public int getCount(){
        return count;
    }
}
