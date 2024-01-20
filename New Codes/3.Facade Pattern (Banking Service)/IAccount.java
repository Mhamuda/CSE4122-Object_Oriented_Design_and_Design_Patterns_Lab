public interface IAccount {
    public void deposit(int amount);
    public boolean withdraw(int amount);
    public String getAccountNumber();
    public int getBalance();
    
}