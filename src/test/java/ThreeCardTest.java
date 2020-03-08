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
	void deckShuffleTest(){
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



}
