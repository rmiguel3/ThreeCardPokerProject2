import java.util.ArrayList;
import java.util.Collections;

public class Deck extends ArrayList<Card> {

    ArrayList<Card> deck = new ArrayList<Card>();

    //adds Cards class into the deck class then shuffles for a randomize order
    public Deck(){
        for(int i = 2; i < 15; i++){
            deck.add(new Card('C', i));
            deck.add(new Card('D', i));
            deck.add(new Card('H', i));
            deck.add(new Card('S', i));
            Collections.shuffle(deck);
        }
    }

    //clears the current deck and replaces it with a brand new shuffle deck
    public ArrayList<Card> newDeck(){
        deck.clear();
        return new Deck();
    }
}
