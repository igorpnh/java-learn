package org.example.domain.account;

import org.example.domain.fee.SavingsFeeStrategy;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String ownerName) {
        super(accountNumber, ownerName, AccountType.SAVINGS, new SavingsFeeStrategy());
    }

}
