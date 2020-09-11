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
public class Field {
    private ArrayList players;
    private ArrayList side;
    
    public Field(Player player_1, Player player_2){
        this.players.add(player_1);
        this.players.add(player_2);
        player_1.setSide(1);
        player_2.setSide(2);
        
    } 
}
