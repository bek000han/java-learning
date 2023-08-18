
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RM
 */
public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        for (Card card: this.hand) {
            System.out.println(card.getSuit() + " " + convertNumToCard(card));
        }
    }
    
    public String convertNumToCard (Card card) {
        int cardValue = card.getValue();
        String[] peopleCards = {"A", "K", "Q", "J"};
        if (cardValue < 1) {
            return null;
        } else if (cardValue < 11) {
            return String.valueOf(cardValue);
        } else if (cardValue < 15) {
            return peopleCards[Math.abs(cardValue - 14)];
        } else {
            return null;
        }
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        Collections.sort(this.hand, comparator);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.valueOfHand() - hand.valueOfHand();
    }
    
    private int valueOfHand() {
        int total = 0;
        for (Card card: this.hand) {
            total += card.getValue();
        }
        return total;
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
