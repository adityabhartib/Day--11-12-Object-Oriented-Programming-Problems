package com.bridgelabz.StockAccountManagement;

public class Stock {
    private String stockName;
    private int numOfShare;
    private double sharePrice;
    private double totalValueOfShares;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumOfShare() {
        return numOfShare;
    }

    public void setNumOfShare(int nomOfShare) {
        this.numOfShare = nomOfShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getTotalValueOfShares() {
        return totalValueOfShares;
    }

    public void setTotalValueOfShares(double totalValueOfShares, double sharePrice) {
        this.totalValueOfShares = totalValueOfShares;
    }
}
