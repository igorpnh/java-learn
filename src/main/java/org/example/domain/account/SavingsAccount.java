package org.example.domain.account;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String ownerName) {
        super(accountNumber, ownerName, AccountType.SAVINGS);
    }

}
