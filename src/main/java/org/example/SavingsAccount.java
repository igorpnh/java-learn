package org.example;

public class SavingsAccount extends BankAccount {
    private static final double FEE_TAX = 0.02;

    public SavingsAccount(String accountNumber, String ownerName) {
        super(accountNumber, ownerName);
    }

    @Override
    public void withdraw(double amount) {
        double totalDebit = amount + (amount * FEE_TAX);
        super.withdraw(totalDebit);
    }

}
