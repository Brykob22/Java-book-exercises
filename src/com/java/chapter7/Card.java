// Fig. 7.9: Card.java
// The Card class represents a playing card.

package com.java.chapter7;

public class Card {

    private String face; // face of the card ("Ace", "Two", ...)
    private String suit; // suit of the card ("Hearts", "Diamonds", ...)

    // the two-argument constructor initializes the face and suit of the card
    public Card(String cardFace, String cardSuit) {

        face = cardFace; // initialize the face of the card
        suit = cardSuit; // initialize the suit of the card

    } // end of Card constructor with two arguments

    // returns String representation of Card
    public String toString() {

        return face + " of " + suit;

    } // end of method toString

} // end of class Card