/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
2 formats possible for communication
Either use stop and wait for info to pass between
Or set class data info such as Database.defdeck1 = df1;
*/

package game;
import java.util.ArrayList;
import java.io.File;
import java.util.Random;
import game.*;
import game.SCREENS.*;
/**
 *
 * @author Logan McDowell
 */
public class Database{
    public static Deck dd1,dd2,dd3,dd4,dd5;
    public static Deck cd1,cd2,cd3,cd4,cd5;
    
    private static ArrayList cardListBuildRandom(){
        //Random Builder
        Random rand1 = new Random();
        ArrayList<Card> tempCardList = new ArrayList();
        for(int i = 0;i < 20;i++){
            Card tempCard = new Card((i+1),"Card "+(i+1),rand1.nextInt(7)+1,rand1.nextInt(4)+1,rand1.nextInt(9)+1);
            tempCardList.add(tempCard);
        }
        return tempCardList;
    }
    
    public static void main(String []args) {
        /*
        Card card1 = new Card(1,"Test Card",0,1,5);
        System.out.println(card1.getCard());
        */
        Random r1 = new Random();

        ArrayList players;
        ArrayList cardTotal; //card ID = Listindex+1 (index of 0 is debug card DO NOT GIVE ID 0 TO ACTUAL CARD)
        
        Player p1 = new Player(0,"player1",10,10);
        //p1.addDeck(def1);
        //p1.setDeck(def2); Called in SCREEN_StartGame
        
        Deck test = new Deck(0,"TestDeck",20,cardListBuildRandom());
        System.out.println(test.getDeck());
        
        for(int i = 0;i<test.getSize();i++){
            Card tempCard = test.getList().get(i);
            System.out.println(tempCard.getCard());
        }
        System.out.println("End test deck list");
        
        
        //Game Time
        
        game.SCREENS.SCREEN_MainMenu mm = new game.SCREENS.SCREEN_MainMenu();
        mm.setVisible(true);
        while(mm.getAction()==0){
            
        }
        switch(mm.getAction()){
            case 1:
                SCREEN_StartGame sg = new SCREEN_StartGame();
                break;
            case 2:
                SCREEN_Decks dv = new SCREEN_Decks(dd1,dd2,dd3,dd4,dd5,cd1,cd2,cd3,cd4,cd5);
                break;
            case 3:
                SCREEN_Options op = new SCREEN_Options();
        }
        mm.response = true;
        
        return;
    }
    
}
