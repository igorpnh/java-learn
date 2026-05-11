package org.example.domain.account;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, String ownerName) {
        super(accountNumber, ownerName, AccountType.CHECKING);
    }
}