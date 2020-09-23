/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Logan McDowell
 */
public class Database {

    public static void main(String []args) {
        Card card1 = new Card(1,"Test Card",0,1,5);
        System.out.println(card1.getCard(card1));
        
        game.SCREENS.SCREEN_MainMenu mm = new game.SCREENS.SCREEN_MainMenu();
        mm.setVisible(true);
        
        ArrayList players;
        ArrayList cardTotal; //card ID = Listindex+1 (index of 0 is debug card DO NOT GIVE ID TO ACTUAL CARD)
        
        int[] df1 = {1,2,3}; 
        Deck def1;
        int[] df2 = {1,2,3};
        Deck def2;
        int[] df3 = {1,2,3};
        Deck def3;
        Deck def4;
        Deck def5;
        
        Player p1 = new Player(0,"player1",10,10);
        //p1.addDeck(def1);
        //p1.setDeck(def2); Called in SCREEN_StartGame
        
        
    }
    
}
