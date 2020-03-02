import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand;
	private int anteBet;
	private int playBet;
	private int pairPlusBet;
	private int totalWinnings;

	Player() {
		hand = new ArrayList<Card>();
		anteBet = 0;
		playBet = 0;
		pairPlusBet = 0;
		totalWinnings = 0;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public int getAnteBet() {
		return anteBet;
	}

	public int getPlayBet() {
		return playBet;
	}

	public int getPairPlusBet() {
		return pairPlusBet;
	}

	public int getTotalWinnings() {
		return totalWinnings;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public void setAnteBet(int anteBet) {
		this.anteBet = anteBet;
	}

	public void setPlayBet(int playBet) {
		this.playBet = playBet;
	}

	public void setPairPlusBet(int pairPlusBet) {
		this.pairPlusBet = pairPlusBet;
	}

	public void setTotalWinnings(int totalWinnings) {
		this.totalWinnings = totalWinnings;
	}

}
