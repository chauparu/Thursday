/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
import java.util.*;

public class CardTrick {
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    private String[] hand;

    public CardTrick() {
        hand = new String[7];
        fillHandWithRandomCards();
    }

    private void fillHandWithRandomCards() {
        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            String suit = suits[random.nextInt(suits.length)];
            String rank = ranks[random.nextInt(ranks.length)];
            hand[i] = rank + " of " + suit;
        }
    }

    public boolean isCardInHand(String card) {
        for (String handCard : hand) {
            if (handCard.equalsIgnoreCase(card)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardTrick trick = new CardTrick();

        System.out.print("Pick a card: ");
        String pickedCard = scanner.nextLine();

        if (trick.isCardInHand(pickedCard)) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}
