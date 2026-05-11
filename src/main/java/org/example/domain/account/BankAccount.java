package org.example.domain.account;

import org.example.interfaces.AccountOperations;
import org.example.interfaces.FeeStrategy;

public abstract class BankAccount implements AccountOperations {
    private final AccountType type;
    private final FeeStrategy feeStrategy;
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, AccountType type, FeeStrategy feeStrategy) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
        this.type = type;
        this.feeStrategy = feeStrategy;
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

        double fee = feeStrategy.calculate(amount);
        double total = amount + fee;

        if (total > this.balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        this.balance -= total;
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
