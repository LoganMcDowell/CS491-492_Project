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
public class Player {

    private int ID;
    private String name;
    private ArrayList decks; //Custom Decks
    private int HP; //Default: 30?
    private int Mana; //Default: 1(or 2), with increase by 1 each turn
    private Deck chosenDeck;
    private int side;
    private boolean isUser = false;
    private boolean isDebug = false;
    
    public Player (int ID,String name,ArrayList decks,int HP,int Mana, Deck chosenDeck){
       this.ID = ID;
       this.name = name;
       this.decks = decks;
       this.HP = HP;
       this.Mana = Mana;
       this.chosenDeck = chosenDeck;
    }
    
    public void User(){
        this.name = "Player "+this.ID;
        this.isUser = true;
        if(ID == 0){
            this.isDebug = true;
        }
    }
    public void AI(){
        this.name = "Computer";
        this.isUser = false;
    }
    
    public int getSide(){
        return this.side;
    }
    protected void setSide(int side){
        this.side = side;
    }
}
