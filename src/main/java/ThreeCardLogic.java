import java.util.Collections;
import java.util.ArrayList;


public class ThreeCardLogic {
    //checks if a hand has a straight
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

    //checks if a hand has a flush
    private static boolean flush(ArrayList<Card> hand){
        ArrayList<Character> suitVal = new ArrayList<Character>();
        suitVal.add(hand.get(0).getSuit());
        suitVal.add(hand.get(1).getSuit());
        suitVal.add(hand.get(2).getSuit());
        Collections.sort(suitVal);
        if((suitVal.get(0) == suitVal.get(1)) && (suitVal.get(1) == suitVal.get(2))){
            return true;
        }
        return false;
    }

    //checks to see if we have a pair or Three of a kind
    private static int pairOrThree(ArrayList<Card> hand){
        ArrayList<Integer> cardVal = new ArrayList<Integer>();
        cardVal.add(hand.get(0).getValue());
        cardVal.add(hand.get(1).getValue());
        cardVal.add(hand.get(2).getValue());
        Collections.sort(cardVal);
        if((cardVal.get(0) == cardVal.get(1)) && (cardVal.get(1) == cardVal.get(2))){
            return 3;
        }
        else if((cardVal.get(0) == cardVal.get(1)) || (cardVal.get(1) == cardVal.get(2))){
            return 2;
        }
        return 0;
    }

    //evaluates an individuals hand and returns an int depending on the hand
    public static int evalHand(ArrayList<Card> hand){
        if(pairOrThree(hand) == 2){
            return 5;
        }
        else if(flush(hand)){
            return 4;
        }
        else if(straight(hand)){
            return 3;
        }
        else if(pairOrThree(hand) == 3){
            return 2;
        }
        else if((straight(hand)) && (flush(hand))){
            return 1;
        }
        return 0;
    }

    //returns amount won for the PairPlus bet
    public static int evalPPWinnings(ArrayList<Card> hand, int bet){
        int handNum = evalHand(hand);
        if(handNum == 2){
            return bet;
        }
        else{
            return 0;
        }
    }

    //compares hands between player and dealer returns a num depending on who won
    public static int compareHands(ArrayList<Card> dealer, ArrayList<Card> player){
        int dealerNum = evalHand(dealer);
        int playerNum = evalHand(player);
        if(dealerNum > playerNum){
            return 1;
        }
        else if(dealerNum < playerNum){
            return 2;
        }
        else{
            return 0;
        }
    }
}
