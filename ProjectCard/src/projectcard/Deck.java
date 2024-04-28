/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dosen
 */
public class Deck {

    private List<Card> deck;

    public Deck(List<Card> deck) {
        this.deck = deck;
    }
    
    public Deck() {
        deck = new LinkedList<Card>();
        String[] suit = {"spades", "hearts", "clubs", "diamonds"};
        Rank[] rank = Rank.values();

        for (int i = 0; i < rank.length; i++) {
            for (int j =0; j<suit.length; j++){
                Card C = new Card (rank[i],suit[j]);
                deck.add(C);
            }
        }
        shuffle();
    }
    
    @Override
    public String toString() {
        return "Deck:"+deck.size()+"\n{" + "cards=" + deck + '}';
    }

    public int size() {
        return deck.size();

    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
    public List dealHand (int maxCard){
        int deckSize = deck.size();
        List handView = deck.subList(deckSize-maxCard, deckSize);
        List hand = new ArrayList(handView);
        handView.clear();
        return hand;
    }
}
