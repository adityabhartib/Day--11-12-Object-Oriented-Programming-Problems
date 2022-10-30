package com.bridgelabz.StockAccountManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    ArrayList<Stock> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private void setStocks() {
        System.out.println("-------Welcome to Stock Account Management--------");
        System.out.println("Enter the Number of Stock Accounts : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            Stock stockAccount = new Stock();
            addStockInfo(stockAccount, i);
        }
    }
    private void addStockInfo(Stock stockAccount, int i) {
        System.out.println("Enter the Stock " + (i + 1) +"  Information :");
        System.out.println("Enter the Stock Name :");
        stockAccount.setStockName(sc.next());
        System.out.println("Enter the Number of Shares :");
        stockAccount.setNumOfShare(sc.nextInt());
        System.out.println("Enter the Price of Share :");
        stockAccount.setSharePrice(sc.nextDouble());
        stockAccount.setTotalValueOfShares(stockAccount.getNumOfShare(), stockAccount.getSharePrice());
        list.add(stockAccount);
    }

    private void showStockInfo() {
        int i = 1;
        for (Stock stockAccount : list) {
            System.out.println("Stock " + i + "Information is :");
            System.out.println("Stock Name : " + stockAccount.getStockName());
            System.out.println("Number of Shares : " + stockAccount.getNumOfShare());
            System.out.println("Price of each Shares : " + stockAccount.getSharePrice());
            System.out.println("Total Value of Shares : " + stockAccount.getTotalValueOfShares());
            i++;
        }
    }

    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.setStocks();
        stockPortfolio.showStockInfo();
    }
}