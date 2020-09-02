/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.io.*;

/**
 *
 * @author Logan McDowell
 */
public class Card {
    
    private int ID;
    private String name;
    private int attack;
    private int defense;
    /* To be used for GUI card images
    private File image;
    */
    public Card(int ID,String name,int attack,int defense) {
        this.ID = ID;
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }
    
    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public int getAttack(){
        return this.attack;
    }
    public int getDefense(){
        return this.defense;
    }
    
    public String getCard(Card card){    
        
        return "ID: "+card.ID+"\nName: "+card.name+"\nAttack: "+card.attack+"\nDefense: "+card.defense;
    }
}
