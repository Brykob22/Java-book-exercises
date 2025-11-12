// Fig. 7.10: DeckOfCards.java
// The DeckOfCards class represents a deck of playing cards.

package com.java.chapter7;

import java.util.Random;

public class DeckOfCards {

    private Card deck[]; // array of Card objects
    private int currentCard; // index of the next Card to deal
    private final int NUMBER_OF_CARDS = 52; // constant number of Cards
    private Random randomNumbers; // random number generator

    // constructor fills the deck of Cards
    public DeckOfCards() {

        String faces[] = { "Ace", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

        String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
        currentCard = 0; // set currentCard so first Card dealt is deck[0]
        randomNumbers = new Random(); // create random number generator

        // fill deck with Card objects
        for (int count = 0; count < deck.length; count++) {

            deck[count] = new Card(faces[count % 13], suits[count / 13]);

        } // end for

    } // end of DeckOfCards constructor

    // shuffle the deck of Cards with one-pass algorithm
    public void shuffle() {

        // after shuffling, dealing should start at deck[0] again
        currentCard = 0; // reinitialize currentCard

        // for each Card, select another random Card and swap them
        for (int first = 0; first < deck.length; first++) {

            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap the current Card with the randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        } // end for

    } // end of method shuffle

    // deal one Card
    public Card dealCard() {

        // determine if there are Cards left to deal
        if (currentCard < deck.length)
            return deck[currentCard++]; // return current Card in array
        else
            return null; // return null to indicate all Cards have been dealt

    } // end of method dealCard

} // end of class DeckOfCards