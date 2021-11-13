package com.aleke.alibi;

public class Inventory {
    int quantity = 100;

    public void inv_reduce(int inventory){
        inventory = quantity - inventory;
        System.out.println("Current quantity of products in stock after sale: "+ inventory);
    }
}
