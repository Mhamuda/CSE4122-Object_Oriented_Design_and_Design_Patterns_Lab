public class Customer {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        
        String savingsAccount = bankService.createNewAccount("saving", 10000);
        String investmentAccount = bankService.createNewAccount("investment", 100000);

        System.out.println("Account balance information: ");
        System.out.println("Saving account balance: "+bankService.getAccountBalance(savingsAccount)+"$");
        System.out.println("Investment account balance: "+bankService.getAccountBalance(investmentAccount)+"$");
        
        bankService.transferMoney(savingsAccount, investmentAccount, 104);
        
        System.out.println("\nAccount balance after transaction: ");
        System.out.println("Saving account balance: "+bankService.getAccountBalance(savingsAccount)+"$");
        System.out.println("Investment account balance: "+bankService.getAccountBalance(investmentAccount)+"$");
    }
    
}
