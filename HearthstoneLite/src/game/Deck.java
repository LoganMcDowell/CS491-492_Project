/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.ArrayList;
/**
 *
 * @author lmcdo
 */
public class Deck {
    
    private int ID;
    private String name;
    //private int size;
    private ArrayList listCards;
    
    public Deck(int ID, String name, int size, ArrayList listCards){
        this.ID = ID;
        this.name = name;
        //this.size = size;
        this.listCards = listCards;
    }
    
    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public int getSize(){
        return this.listCards.size();
    }
    public ArrayList getList(){
        return this.listCards;
    }
    
    public String getDeck(Deck deck){    
        
        return "ID: "+deck.ID+"\nName: "+deck.name+"\nSize: "+deck.getSize();
        
    }
    
    // addCard(Card card) && removeCard(int i) function
    //Deck is in list[Card] format
}
