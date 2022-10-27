package com.bridgelabz.AccountManagementSystem;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Account {
   public double balance;


    // Debit method to check account balance and debit some amount

    public void debitMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount for Debit:");
        int debitAmount = sc.nextInt();
        if (debitAmount < balance) {
            balance -= debitAmount;
            System.out.println("Debit amount is: " + debitAmount);
            System.out.println("---------------------------------");
            System.out.println("Account balance after update : " + balance);
        } else {
            System.out.println("Debit amount exceeded Account balance");
        }
    }
    public void showBalance(){
        System.out.println("-------------------");
        System.out.println("Balance "+balance);
    }
}
