import java.util.Hashtable;

public class BankService {
    private Hashtable<String, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<String, IAccount>();
    }

    public String createNewAccount(String type, int starting_deposit) {
        IAccount newAccount = null;
        switch (type) {
            case "chequing":
                newAccount = new Chequing(starting_deposit);
                break;
            case "saving":
                newAccount = new Saving(starting_deposit);
                break;
            case "investment":
                newAccount = new Investment(starting_deposit);
                break;
            default:
                System.out.println("Invalid account type.");
                break;
        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return null;

    }

    public int getAccountBalance(String accountNumber) {
        return bankAccounts.get(accountNumber).getBalance();
    }

    public void transferMoney(String to, String from, int amount) {
        IAccount toAccount = bankAccounts.get(to);
        IAccount fromAccount = bankAccounts.get(from);
        boolean withdrawStatus = fromAccount.withdraw(amount);

        if (withdrawStatus) {
            toAccount.deposit(amount);
            System.out.println("\nSuccessfully transfered " + amount + "$");
        } else {
            System.out.println("\nInsufficient balance!");
        }
    }

}
