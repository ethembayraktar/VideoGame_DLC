package com.company;

public abstract  class Product {
    String tittle;
    double price;
    private int inventoryCount;

    public Product(String tittle, double price, int inventoryCount) {
        this.tittle = tittle;
        this.price = price;
        this.inventoryCount = inventoryCount;


    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }


    public abstract String GetDescription();
}
