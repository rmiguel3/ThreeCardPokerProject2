import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

class ThreeCardTest {
	Deck deck;
	Dealer dealer;

	@BeforeEach
	void init() {
		deck = new Deck();
		dealer = new Dealer();
	}

	//checking the length of the deck
	@Test
	void deckLength(){
		assertEquals(52, deck.size(), "Not setting up a 52 Deck");
	}

	//checking to see if each suit has 13 cards
	@Test
	void deckSuitCount(){
		int spadesCount = 0;
		int heartsCount = 0;
		int diamondsCount = 0;
		int clubsCount = 0;
		for(int i = 0; i < deck.size(); i++){
			if(deck.get(i).getSuit() == 'C'){
				clubsCount += 1;
			}
			else if(deck.get(i).getSuit() == 'S'){
				spadesCount += 1;
			}
			else if(deck.get(i).getSuit() == 'D'){
				diamondsCount += 1;
			}
			else if(deck.get(i).getSuit() == 'H'){
				heartsCount += 1;
			}
		}
		assertEquals(13, spadesCount, "Not setting up 13 cards for spades");
		assertEquals(13, clubsCount, "Not setting up 13 cards for clubs");
		assertEquals(13, diamondsCount, "Not setting up 13 cards for diamonds");
		assertEquals(13, heartsCount, "Not setting up 13 cards for hearts");
	}

	//checks to see if newDeck method is resetting the deck and placing a newDeck
	@Test
	void newDeckTest(){
		deck.newDeck();
		assertEquals(52, deck.size(), "Not resetting the deck correctly");
	}

	@Test
	void deckShuffleValueTest(){
		ArrayList<Integer> cardVals = new ArrayList<Integer>(3);
		ArrayList<Integer> newCardVals = new ArrayList<Integer>(3);
		cardVals.add(deck.get(0).getValue());
		cardVals.add(deck.get(1).getValue());
		cardVals.add(deck.get(2).getValue());
		deck.newDeck();
		newCardVals.add(deck.get(0).getValue());
		newCardVals.add(deck.get(1).getValue());
		newCardVals.add(deck.get(2).getValue());
		assertNotSame(cardVals, newCardVals, "Not shuffling correctly");
	}

	@Test
	void deckShuffleSuitTest(){
		ArrayList<Character> cardVals = new ArrayList<Character>(3);
		ArrayList<Character> newCardVals = new ArrayList<Character>(3);
		cardVals.add(deck.get(0).getSuit());
		cardVals.add(deck.get(1).getSuit());
		cardVals.add(deck.get(2).getSuit());
		deck.newDeck();
		newCardVals.add(deck.get(0).getSuit());
		newCardVals.add(deck.get(1).getSuit());
		newCardVals.add(deck.get(2).getSuit());
		assertNotSame(cardVals, newCardVals, "Not shuffling correctly");
	}

	@Test
	void dealerDeckTest(){
		assertEquals(52, dealer.getTheDeck().size(), "Not grabbing Deck correctly");
	}

	@Test
	void testDealersHand(){
		assertNotNull(dealer.getDealersHand(), "It is not returning cards");
	}

	@Test
	void testDealHand(){
		dealer.dealHand();
		assertEquals(49, dealer.getTheDeck().size(), "Not removing cards from the deck");
	}

	@Test
	void testDealHandArray(){
		ArrayList<Card> dealersHand = new ArrayList<Card>();
		dealersHand = dealer.dealHand();
		assertNotNull(dealersHand, "Not returning an arrayList of cards taken from Deck");
	}

	@Test
	void testDealHandArraySize(){
		ArrayList<Card> dealersHand = new ArrayList<Card>();
		dealersHand = dealer.dealHand();
		assertEquals(3, dealersHand.size(), "Not adding 3 Card objects");
	}

	@Test
	void testEvalHandPair(){
		ArrayList<Card> pairCard = new ArrayList<Card>();
		pairCard.add(new Card('H', 5));
		pairCard.add(new Card('C', 5));
		pairCard.add(new Card('S', 2));
		assertEquals(5, ThreeCardLogic.evalHand(pairCard), "Not returning a pair");
	}

	@Test
	void testEvalHandFlush(){
		ArrayList<Card> flushCard = new ArrayList<Card>();
		flushCard.add(new Card('H', 8));
		flushCard.add(new Card('H', 5));
		flushCard.add(new Card('H', 2));
		assertEquals(4, ThreeCardLogic.evalHand(flushCard), "Not returning a flush");
	}

	@Test
	void testEvalHandStraight(){
		ArrayList<Card> straightCard = new ArrayList<Card>();
		straightCard.add(new Card('H', 8));
		straightCard.add(new Card('S', 7));
		straightCard.add(new Card('C', 6));
		assertEquals(3, ThreeCardLogic.evalHand(straightCard), "Not returning a straight");
	}

	@Test
	void testEvalHandThreePair(){
		ArrayList<Card> threePairCard = new ArrayList<Card>();
		threePairCard.add(new Card('H', 11));
		threePairCard.add(new Card('S', 11));
		threePairCard.add(new Card('C', 11));
		assertEquals(2, ThreeCardLogic.evalHand(threePairCard), "Not returning a Three of a Kind");
	}

	@Test
	void testEvalHandStraightFlush(){
		ArrayList<Card> straightFlushCard = new ArrayList<Card>();
		straightFlushCard.add(new Card('H', 7));
		straightFlushCard.add(new Card('H', 9));
		straightFlushCard.add(new Card('H', 8));
		assertEquals(1, ThreeCardLogic.evalHand(straightFlushCard), "Not returning a Straight Flush");
	}


	@Test
	void testEvalHandHighCard(){
		ArrayList<Card> highCard = new ArrayList<Card>();
		highCard.add(new Card('H', 7));
		highCard.add(new Card('C', 1));
		highCard.add(new Card('S', 9));
		assertEquals(0, ThreeCardLogic.evalHand(highCard), "Not returning a high card");
	}

	@Test
	void testCHDealerLost(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 7));
		dealerHand.add(new Card('C', 1));
		dealerHand.add(new Card('S', 9));
		playersHand.add(new Card('H', 7));
		playersHand.add(new Card('H', 8));
		playersHand.add(new Card('C', 2));
		assertEquals(2, ThreeCardLogic.compareHands(dealerHand, playersHand), "dealer is not losing");
	}

	@Test
	void testCHDealerWon(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 7));
		dealerHand.add(new Card('H', 8));
		dealerHand.add(new Card('H', 9));
		playersHand.add(new Card('H', 7));
		playersHand.add(new Card('S', 7));
		playersHand.add(new Card('C', 7));
		assertEquals(1, ThreeCardLogic.compareHands(dealerHand, playersHand), "player is not losing");
	}

	@Test
	void testCHNeitherWins(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 7));
		dealerHand.add(new Card('H', 8));
		dealerHand.add(new Card('H', 9));
		playersHand.add(new Card('H', 7));
		playersHand.add(new Card('H', 9));
		playersHand.add(new Card('H', 8));
		assertEquals(0, ThreeCardLogic.compareHands(dealerHand, playersHand), "someone is winning");
	}

	@Test
	void testCHPlayerWonHighCard(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 7));
		dealerHand.add(new Card('D', 2));
		dealerHand.add(new Card('S', 9));
		playersHand.add(new Card('H', 10));
		playersHand.add(new Card('S', 9));
		playersHand.add(new Card('C', 7));
		assertEquals(2, ThreeCardLogic.compareHands(dealerHand, playersHand), "dealer is not losing");
	}

	@Test
	void testCHPlayerWonHighCard2(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 7));
		dealerHand.add(new Card('D', 11));
		dealerHand.add(new Card('S', 9));
		playersHand.add(new Card('H', 11));
		playersHand.add(new Card('S', 10));
		playersHand.add(new Card('C', 8));
		assertEquals(2, ThreeCardLogic.compareHands(dealerHand, playersHand), "dealer is not losing");
	}
	@Test
	void testCHPlayerWonHighCard3(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 7));
		dealerHand.add(new Card('D', 11));
		dealerHand.add(new Card('S', 10));
		playersHand.add(new Card('H', 11));
		playersHand.add(new Card('S', 10));
		playersHand.add(new Card('C', 8));
		assertEquals(2, ThreeCardLogic.compareHands(dealerHand, playersHand), "dealer is not losing");
	}

	@Test
	void testCHDealerWonHighCard(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 7));
		dealerHand.add(new Card('D', 13));
		dealerHand.add(new Card('S', 3));
		playersHand.add(new Card('H', 12));
		playersHand.add(new Card('D', 2));
		playersHand.add(new Card('C', 8));
		assertEquals(1, ThreeCardLogic.compareHands(dealerHand, playersHand), "player is not losing");
	}

	@Test
	void testCHDealerWonHighCard2(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 7));
		dealerHand.add(new Card('D', 13));
		dealerHand.add(new Card('S', 8));
		playersHand.add(new Card('H', 13));
		playersHand.add(new Card('D', 6));
		playersHand.add(new Card('C', 2));
		assertEquals(1, ThreeCardLogic.compareHands(dealerHand, playersHand), "player is not losing");
	}

	@Test
	void testCHDealerWonHighCard3(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 7));
		dealerHand.add(new Card('D', 13));
		dealerHand.add(new Card('S', 8));
		playersHand.add(new Card('H', 12));
		playersHand.add(new Card('D', 8));
		playersHand.add(new Card('C', 4));
		assertEquals(1, ThreeCardLogic.compareHands(dealerHand, playersHand), "player is not losing");
	}

	@Test
	void testCHDealerWonPairHighCard(){
		ArrayList<Card> dealerHand = new ArrayList<Card>();
		ArrayList<Card> playersHand = new ArrayList<Card>();
		dealerHand.add(new Card('H', 13));
		dealerHand.add(new Card('D', 13));
		dealerHand.add(new Card('S', 3));
		playersHand.add(new Card('H', 12));
		playersHand.add(new Card('D', 12));
		playersHand.add(new Card('C', 8));
		assertEquals(1, ThreeCardLogic.compareHands(dealerHand, playersHand), "player is not losing");
	}

}
