/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.ArrayList;
/**
 *
 * @author Logan McDowell
 */
public class Hand {
    private ArrayList cards;
    private Player owner;
    private int size;
    /*
    @vars = ID, cards
        Class object for creation of each Hand.
        Takes 
    */
    public Hand(Player player, ArrayList cards){
        this.owner = player;
        this.cards = cards;
        this.size = cards.size();
    }
    /*  
    @vars = card
        Adds a card object to the end of the list, then updates the size.
        Returns the card object   
    */
    public Card addCard(Card card){
        this.cards.add(card);
        this.size = this.cards.size();
        return card;
    }
    /*
    @vars = index, card
        Checks for the provided card object at the given index value.
        If a match, removes the card at that index and then updates the size.
    */
    public Card removeCard(int index, Card card){
        if (this.cards.get(index).equals(card)){
            this.cards.remove(index);
            this.size = this.cards.size();
        }
        return card;
    }
}
