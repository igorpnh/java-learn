package org.example;

import org.example.domain.account.CheckingAccount;
import org.example.domain.account.SavingsAccount;
import org.example.interfaces.AccountOperations;
import org.example.services.AccountService;

public class Main {
    public static void main(String[] args){
        AccountService service = new AccountService();

        AccountOperations acc_one = new CheckingAccount("1", "John Doe");
        AccountOperations acc_two = new SavingsAccount("2", "Marie Doe");

        service.deposit(acc_one, 1000);
        service.transfer(acc_one, acc_two, 200);

        System.out.println("One: " + acc_one);
        System.out.println("Two: " + acc_two);
    }
}
