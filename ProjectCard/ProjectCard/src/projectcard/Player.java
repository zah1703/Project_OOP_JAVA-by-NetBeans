/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcard;

/**
 *
 * @author dosen
 */
public class Player {
    private String name;
    private Deck deckPlayer;

    public Player(String name, Deck deckPlayer) {
        this.name = name;
        this.deckPlayer = deckPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeckPlayer() {
        return deckPlayer;
    }

    public void setDeckPlayer(Deck deckPlayer) {
        this.deckPlayer = deckPlayer;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + "\n" +"\n"+ deckPlayer + '}';
    }
    
}
