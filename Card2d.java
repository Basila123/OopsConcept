package com.bridgelabzOops;
import java.util.*;
public class Card2d {
    String[] shape = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] card = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[] array1D = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    static String[][] array2D = new String[4][9];

    //main method
    public static void main(String[] args) {
        Card2d obj = new Card2d();
        obj.generateRandomCards();
    }

    /**
     random card method is used to generate a random card from a deck of 52 cards
     @return random card method returns a card of String type
     */
    public String randomCard() {
        Random rand = new Random();
        return shape[rand.nextInt(4)] + " " + card[rand.nextInt(13)];
    }

    /**
     * Method to display the cards received by the 4 players
     */
    public void showPlayerCards() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                array2D[i][j] = array1D[(i + 1) * (j + 1) - 1];
            }
        }
        int i = 1;
        for (String[] row : array2D) {
            System.out.println("Player " + i + ": " + Arrays.toString(row) + " \n");
            i++;
        }
    }

    //Method to generate the required no.of cards and distribute them to the 4 players

    public void generateRandomCards() {
        Card2d obj = new Card2d();
        for (int i = 0; i < 36; i++) {
            String x = obj.randomCard();
            for (int j = 0; j <= i; j++) {
                if (array1D[j].equals(x)) {
                    x = obj.randomCard();
                    j = 0;
                }
            }
            array1D[i] = x;
        }
        obj.showPlayerCards();
    }
}
