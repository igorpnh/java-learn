package org.example.interfaces;

import org.example.domain.account.AccountType;

public interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    AccountType getType();
}
