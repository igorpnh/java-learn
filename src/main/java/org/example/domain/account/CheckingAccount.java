package org.example.domain.account;

import org.example.domain.fee.CheckingFeeStrategy;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, String ownerName) {
        super(accountNumber, ownerName, AccountType.CHECKING, new CheckingFeeStrategy());
    }
}