import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;

	public Deck() {

		//	Create an ArrayList of Cards, add each card
		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];			
			for (short j = 0; j <= 12; j++) {
				eRank RankValue = eRank.values()[j];				
				Card NewCard = new Card(SuitValue,RankValue);
				MakingDeck.add(NewCard);
			}
		}
		
		//	Set the instance variable
		cards = MakingDeck;
		
		//	Shuffle the cards
		Collections.shuffle(cards);
		
	}
	//____________________________________________________
	
	//NEW CONSTRUCTOR WITH 1 PARAMETER FOR RANDOM JOKER VALUES
	
	public Deck(int Jokers) {

		//	Create an ArrayList of Cards, add each card then add # of jokers
		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];			
			for (short j = 0; j <= 12; j++) {
				eRank RankValue = eRank.values()[j];				
				Card NewCard = new Card(SuitValue,RankValue);
				MakingDeck.add(NewCard);
			}

		int temp = 0;
		for (temp = 0; temp < Jokers - 1 ;i++){
			int randomRank = ((int)(Math.random()*13));
			int randomSuit = ((int)(Math.random()*4));
			eRank RankValue2 = eRank.values()[randomRank];
			eSuit SuitValue2 = eSuit.values()[randomSuit];
			Card newJoker = new Card(SuitValue2,RankValue2);
			MakingDeck.add(newJoker);
		}
	}
		//	Set the instance variable
		cards = MakingDeck;
		
		//	Shuffle the cards
		Collections.shuffle(cards);

		
	}
	//____________________________________________________
	

	public Card drawFromDeck() {
		// Removes the first card from the deck and return the card
		Card FirstCard = cards.get(0);
		cards.remove(0);
		return FirstCard;
	}

	public int getTotalCards() {
		// Returns the total number of cards still in the deck
		return cards.size();
	}
}