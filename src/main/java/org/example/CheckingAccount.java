package org.example;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, String ownerName) {
        super(accountNumber, ownerName);
    }

    private static final double FEE = 5.0;

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + FEE);
    }
}