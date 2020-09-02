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
        Card card1 = new Card(1,"Test Card",1,5);
        System.out.println(card1.getCard(card1));
        
        game.SCREENS.SCREEN_MainMenu mm = new game.SCREENS.SCREEN_MainMenu();
        mm.setVisible(true);
        
        ArrayList players;
        
    }
    
}
