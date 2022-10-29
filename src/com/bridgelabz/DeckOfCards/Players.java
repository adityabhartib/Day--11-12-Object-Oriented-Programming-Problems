package com.bridgelabz.DeckOfCards;

import java.util.Scanner;

public class Players {
    public static void main(String[] args) {
        System.out.println("\n1.View cards of 4 Players");
        System.out.println("Enter Choise :");
        DeckOfCard card = new DeckOfCard();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                card.getCardCombination();
                card.getPlayer();
                break;
            default:
                System.out.println("!!invalid input!!");
                break;
        }
    }
}
