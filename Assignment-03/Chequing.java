import java.math.BigDecimal;

public class Chequing implements IAccount {
    private int accountNumber;
    private BigDecimal balance;
    
    public Chequing(BigDecimal initialAmount){
        this.balance = initialAmount;
        this.accountNumber = getAccountNumber();
    }

    @Override
    public void deposit(BigDecimal amount){
        balance = balance.add(amount);
        System.out.println("Chequing - Deposited $" + amount + ". New balance: $" + balance);

    }

    @Override
    public void withdraw(BigDecimal amount){
        if(balance.compareTo(amount)>=0){
            balance = balance.subtract(amount);
            System.out.println("Chequing - Withdrawn $"+amount+". New balance: $"+balance);
        }
        else{
            System.out.println("Chequing - Insufficient funds.");
        }
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount){
        withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Transferred $"+amount+"from chequing to another account.");
    }

    @Override
    public int getAccountNumber(){
        return accountNumber;
    }
 }
