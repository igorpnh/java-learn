package org.example.services;

import org.example.interfaces.AccountOperations;

public class AccountService {
    public void deposit(AccountOperations account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(AccountOperations account, double amount) {
        account.withdraw(amount);
    }

    public void transfer(AccountOperations from, AccountOperations to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

}
