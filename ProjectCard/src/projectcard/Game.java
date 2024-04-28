/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcard;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dosen
 */
public class Game {

    private List<Player> listPlayers;
    private Deck gameDeck;

    public Game(int maxPlayer, int maxCard) {
        listPlayers = new LinkedList<Player>();
        gameDeck = new Deck();
        for (int i = 0; i < maxPlayer; i++) {
            List temp = gameDeck.dealHand(maxCard);
            Deck tempDeck = new Deck (temp);
            Player p = new Player("Pemain " + i, tempDeck);
            listPlayers.add(p);
        }
    }

    public List<Player> getListPlayers() {
        return listPlayers;
    }

    public void setListPlayers(List<Player> listPlayers) {
        this.listPlayers = listPlayers;
    }

    public Deck getGameDeck() {
        return gameDeck;
    }

    public void setGameDeck(Deck gameDeck) {
        this.gameDeck = gameDeck;
    }

    @Override
    public String toString() {
        //return "Game{" + "listPlayers=" + listPlayers + "\n gameDeck=" +gameDeck.size()+ gameDeck + '}';
        String str = "";
        for (int i=0; i<listPlayers.size(); i++){
            str = str + listPlayers.get(i)+"\n";
                    
        }
        str = str + "Game" + gameDeck + "\n";
        return str;
    }

}
