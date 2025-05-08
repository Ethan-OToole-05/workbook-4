package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        deck.shuffle();
        Player player1, player2;
        System.out.println("Welcome to the BlackJack app!");
        System.out.print("Player 1 please enter your name: ");
        String name = input.nextLine();
        Player.format(name);
        System.out.print("Player 2 please enter your name: ");
        String name2 = input.nextLine();
        Player.format(name2);

        //Deal the cards out to each player to 2 cards.
        for (int i = 0; i < 2; i++) {
            Card card = deck.deal();
            hand1.deal(card);
        }
        for (int j = 0; j < 2; j++) {
            Card card = deck.deal();
            hand2.deal(card);
        }

        //Check to see who won below.
        if (hand1.getValue() > hand2.getValue()) {
            System.out.println(name + " Wins!");
        } else if (hand1.getValue() < hand2.getValue()) {
            System.out.println(name2 + " Wins!");
        } else {
            System.out.println("It's a tie! We push.");
        }

        //Print out to see each player's hands.
        int handValue = hand1.getValue();
        int handValue2 = hand2.getValue();
        System.out.println("This hand is worth " + handValue);
        System.out.println("This hand is worth " + handValue2);
    }
}
