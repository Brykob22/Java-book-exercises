// Fig. 7.11: DeckOfCardsTest.java
// Application to shuffle and deal cards.

package com.java.chapter7;

public class DeckOfCardsTest {

    // run the application
    public static void main(String args[]) {

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // put Cards in random order

        // print the 52 Cards in the order they are dealt
        for (int i = 0; i < 13; i++) {

            // deal and print 4 Cards
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard());

        } // end for

    } // end of main

} // end of class DeckOfCardsTest