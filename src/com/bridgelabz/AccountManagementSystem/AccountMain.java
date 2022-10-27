package com.bridgelabz.AccountManagementSystem;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        int choise;
        System.out.println("Enter the account balance : ");
        account.balance = sc.nextDouble();

        do {
            System.out.println("---------------------");
            System.out.println("Select Option :");
            System.out.println("1.Debit \n2.Show Balance\n3.Exit");
            System.out.println("Enter Choise :");
            choise =sc.nextInt();
            switch (choise) {
                case 1:
                    account.debitMethod();
                    break;
                case 2:
                    account.showBalance();
                    break;
                case 3:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Please select Valid Option");

            }
        }while (choise != 3);
    }
}
