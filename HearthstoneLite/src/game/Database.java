/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.ArrayList;
import java.io.*;
import java.util.Random;
/**
 *
 * @author Logan McDowell
 */


/*
This is the central repository of the application.
The database ensures that every class in the application is synchronized,which means
they have access to the same data at each time moment
Since only one instance of the database mantains the state of the in memory data
that every window needs to update its contents
*/
public class Database {
    
    private static Database instance=null;
    private  ArrayList<Deck>deckList=null;
    private  ArrayList<Card>cardList=null;
    private  ArrayList<Deck>customDeckList=new ArrayList<>();
    private  String [][] customDeckListCardTitles=new String[4][4];
    private  int cardSize=0;
    private  int deckNumber=0;
 
    private static Random random=new Random();

    public static void main(String []args) {
        
        Database dt=getInstance();
        
        dt.initializeNecessaryElementsForGame();
        
    }
    
    public static Database getInstance(){
        
        //check if the instance is already created to ensure only one is created
        //at any given time
        
        if(instance==null){
            //then create one
            
            Database ownInstance=new Database();
            
           instance=ownInstance;
        }else{
            return instance;
        }
        

        return instance;
    }

    private void initializeNecessaryElementsForGame() {
        ArrayList<Card>cardList=new ArrayList<Card>();
        ArrayList<Deck>deckList=new ArrayList<Deck>();
        this.setCardSize(60);
        this.setDeckNumber(5);
       
        //before rendering the menu screen we populate our DecksList
        
        for(int i=0;i<this.getCardSize();i++){
            Card card1 = new Card(1,"Basic Card "+i,this.randomIntGen(this.getCardSize()),this.randomIntGen(this.getCardSize()));
            cardList.add(card1);
        }
        this.setCardList(cardList);
        
        for(int i=0;i<this.getDeckNumber();i++){
           Deck gameDeck=new Deck(i, "Player "+(i+1)+"'s Deck", this.getCardSize(), this.getCardList());
           
           deckList.add(gameDeck);
        }
        this.setDeckList(deckList);
        
        game.SCREENS.SCREEN_MainMenu mm = new game.SCREENS.SCREEN_MainMenu();
        mm.setVisible(true);
        
        ArrayList players;
    }
    
    
    //start of methods that maintain the database
    public  ArrayList<Deck> getDeckList() {
        return this.deckList;
    }

    public  void setDeckList(ArrayList<Deck> deckList) {
        this.deckList = deckList;
    }

    public  ArrayList<Card> getCardList() {
        return this.cardList;
    }

    public  void setCardList(ArrayList<Card> cardList) {
        this.cardList = cardList;
    }
  
    //a utility method for generating random Integers
    public static int randomIntGen(int rand){
        
        return random.nextInt(rand)+1;
    }

    public  ArrayList<Deck> getCustomDeckList() {
        return this.customDeckList;
    }

    public  void setCustomDeckList(ArrayList<Deck> customDeckList) {
        this.customDeckList = customDeckList;
    }

    public  String[][] getCustomDeckListCardTitles() {
        return this.customDeckListCardTitles;
    }

    public  void setCustomDeckListCardTitles(String[][] customDeckListCardTitles) {
        this.customDeckListCardTitles = customDeckListCardTitles;
    }

    public  int getCardSize() {
        return this.cardSize;
    }

    public  void setCardSize(int cardSize) {
        this.cardSize = cardSize;
    }

    public int getDeckNumber() {
        return this.deckNumber;
    }

    public  void setDeckNumber(int deckNumber) {
        this.deckNumber = deckNumber;
    }
    
    
}
