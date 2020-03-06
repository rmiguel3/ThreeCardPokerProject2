import java.util.Collections;
import java.util.ArrayList;


public class ThreeCardLogic {
    private static boolean straight(ArrayList<Card> hand){
        ArrayList<Integer> cardVals = new ArrayList<Integer>();
        cardVals.add(hand.get(0).getValue());
        cardVals.add(hand.get(1).getValue());
        cardVals.add(hand.get(2).getValue());
        Collections.sort(cardVals);
        if((cardVals.get(0) + 1 == cardVals.get(1)) && (cardVals.get(1) + 1 == cardVals.get(2))){
            return true;
        }
        return false;
    }

    //private static boolean flush(ArrayList<Card> hand){}

    //private static boolean pair(ArrayList<Card> hand){}

    //public static int evalHand(ArrayList<Card> hand){}

    //public static int evalPPWinnings(ArrayList<Card> hand, int bet);
    //public static int compareHands(ArrayList<Card> dealer, ArrayList<Card> player);
}
