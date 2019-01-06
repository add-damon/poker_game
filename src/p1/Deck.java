package p1;

import java.util.Random;


/**
 * A deck of cards, determines what card is drawn.
 * 
 * @author DDD
 * @version 1.0
 */
public class Deck {
    
    /**
     * Determines the Suit of the Card.
     */
    private String[] suit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    
    /**
     * Determines the Face of the Card.
     */
    private String[] face = {"2", "3", "4", "5", "6", 
            "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    /**
     * A Deck of Cards.
     */
    public Deck() {
        Random random = new Random();
    }
}
