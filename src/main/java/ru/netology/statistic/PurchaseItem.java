package ru.netology.statistic;

public class PurchaseItem {
    private String productName;

    public PurchaseItem(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
