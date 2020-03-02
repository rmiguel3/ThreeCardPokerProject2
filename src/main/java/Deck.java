import java.util.ArrayList;
import java.util.Collections;

public class Deck extends ArrayList<Card> {

    //adds Cards class into the deck class then shuffles for a randomize order
    public Deck(){
        for(int i = 2; i < 15; i++){
            this.add(new Card('C', i));
            this.add(new Card('D', i));
            this.add(new Card('H', i));
            this.add(new Card('S', i));
            Collections.shuffle(this);
        }
    }

    //clears the current deck and replaces it with a brand new shuffle deck
    public ArrayList<Card> newDeck(){
        this.clear();
        return new Deck();
    }

}
