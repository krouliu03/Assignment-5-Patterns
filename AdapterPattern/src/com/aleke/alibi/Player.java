package com.aleke.alibi;

public class Player {

    private int money;

    public Player(){
        this.money = money;
    }

    public void insertDollarsIntoATM(ATM com,int money){
        System.out.print("You have: " + money*0.3 + " chips \n");
        com.convertToChips();
    }
}
