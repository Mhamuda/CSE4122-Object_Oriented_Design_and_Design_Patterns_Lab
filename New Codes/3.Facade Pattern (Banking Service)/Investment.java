public class Investment implements IAccount{
    private int balance;
    private String accountNumber;

    public Investment(int initialBalance){
        this.balance = initialBalance;
        int accNumber = (int) (Math.random() * 100);
        this.accountNumber = Integer.toString(accNumber);
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public boolean withdraw(int amount) {
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public int getBalance() {
        return balance;
    }
    
}
