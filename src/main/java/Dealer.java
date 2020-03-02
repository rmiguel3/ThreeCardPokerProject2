import java.util.ArrayList;

public class Dealer {

    //set the data members
    private Deck theDeck;
    private ArrayList<Card> dealersHand;

    public Deck getTheDeck() {
        return theDeck;
    }

    public void setTheDeck(Deck theDeck) {
        this.theDeck = theDeck;
    }

    public ArrayList<Card> getDealersHand() {
        return dealersHand;
    }

    public void setDealersHand(ArrayList<Card> dealersHand) {
        this.dealersHand = dealersHand;
    }



    //sets up a brand new deck to start off
    public Dealer() {
        theDeck = new Deck();
        dealersHand = new ArrayList<Card>();
    }

    //takes 3 cards from the deck for dealer to use
    public ArrayList<Card> dealHand() {
        
    }


}