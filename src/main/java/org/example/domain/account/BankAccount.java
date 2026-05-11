package org.example.domain.account;

import org.example.interfaces.AccountOperations;

public abstract class BankAccount implements AccountOperations {
    private final AccountType type;
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, AccountType type) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
        this.type = type;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        this.balance -= amount;
    }

    public AccountType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", owner='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }

}
