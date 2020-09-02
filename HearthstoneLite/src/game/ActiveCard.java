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
public class ActiveCard {
    
    private ArrayList active;
    private int owner;
    private int size = active.size();
    
    public ActiveCard(int ID, ArrayList cards){
        this.owner = ID;
        this.active = cards;
        this.size = cards.size();
    }
    
    public Card AddActive(int ID, Card card){
        this.owner = ID;
        active.add(card);
        this.size = this.active.size();
        return card;
    }
    public Card RemoveActive(int ID, Card card, int index){
        this.owner = ID;
        if (this.active.get(index) == card){
            this.active.remove(index);
            this.size = this.active.size();
        }
        return card;
    }
    
    public int getActiveCardSize(){
        return this.size;
    }
    public int getActiveCardOwner(){
        return this.owner;
    }
    public ArrayList getActiveCards(){
        return this.active;
    }
    
    
}
