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
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        for (int i = 0; i < magicHand.length; i++) {
            Card cd = new Card();
            cd.setValue((int) (Math.random() * 13) + 1);
            cd.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = cd;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Pick a card suit (0-3): ");
        int suit = scanner.nextInt();

        luckyCard.setValue(value);
        luckyCard.setSuit(Card.SUITS[suit]);

        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(luckyCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}
