/*
 * This code represents a simple banking system with three account types (Chequing, Saving, Investment) implementing a common interface (IAccount).
 * The BankService class manages a collection of accounts and allows creating new accounts and transferring money between them.
 * The Customer class demonstrates creating accounts and transferring funds between a saving and an investment account.
 */

import java.math.BigDecimal;

public class Customer {
    public static void main(String args[]) {
        BankService myBankService = new BankService();
        int mySaving = myBankService.createNewAccount("saving",new BigDecimal(500.00));
        int myInvestment = myBankService.createNewAccount("investment", new BigDecimal(1000.00));
        myBankService.transferMoney(mySaving, myInvestment, new BigDecimal(300.00));
    }
}
