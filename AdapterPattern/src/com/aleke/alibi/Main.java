package com.aleke.alibi;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	Player player = new Player();
	Bet first_bet = new Bet();
	BetAdapter adapter = new BetAdapter(first_bet);

	System.out.println("Welcome to casino! Before starting the game you enter your cash, and convert money to chips.");
	Scanner in = new Scanner(System.in);
	System.out.print("Enter your cash: ");
	int num = in.nextInt();

	player.insertDollarsIntoATM(adapter,num);
    }
}
