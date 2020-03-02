import java.util.ArrayList;

public class Dealer {

    //set the data members
    private Deck theDeck;
    private ArrayList<Card> dealersHand;


    public Deck getTheDeck() {
        return theDeck;
    }

    public ArrayList<Card> getDealersHand() {
        return dealersHand;
    }

    //sets up a brand new deck to start off
    public Dealer() {
        theDeck = new Deck();
    }

    //takes 3 cards from the deck for dealer to use
    public ArrayList<Card> dealHand(){
        if(theDeck.size() <= 34){
            theDeck.newDeck();
        }
        dealersHand.add(theDeck.remove(0));
        dealersHand.add(theDeck.remove(1));
        dealersHand.add(theDeck.remove(2));
        return dealersHand;
    }


}