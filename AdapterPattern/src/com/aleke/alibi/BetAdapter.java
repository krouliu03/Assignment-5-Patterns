package com.aleke.alibi;

public class BetAdapter implements ATM{
    private Bet bet;

    public BetAdapter(Bet bet){
        this.bet = bet;
    }



    @Override
    public void convertToChips() {
        System.out.println("ATM machine successfully converted dollars to chips");

        bet.makeBet();
    }
}
