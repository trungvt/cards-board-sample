import java.util.*;

public class Deck {

	public final static int MAX_CARDS_IN_DECK = 52;

	private ArrayList<Card> cards;
	public ArrayList<Card> Cards() {
		return cards;
	}
	public Deck() {
		cards = generatingDeck();
	}
	private ArrayList<Card> generatingDeck() {
		ArrayList<Card> deck = new ArrayList<Card>();
		for (int i = 1; i < 14; i++) {
			deck.add(new Card(i, CardType.Spade));
			deck.add(new Card(i, CardType.Heart));
			deck.add(new Card(i, CardType.Diamond));
			deck.add(new Card(i, CardType.Club));
		}
		return deck;
	}
	public int cardsCounting() {
		return cards.size();
	}
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	public boolean isFull() {
		return cards.size() == MAX_CARDS_IN_DECK;
	}
	private boolean addCard(Card _newCard) {
		if (isFull()) return false;
		this.cards.add(_newCard);
		return true;
	}
	public boolean removeCard(Card _removeCard) {
		if (isEmpty()) return false;
		return this.cards.remove(_removeCard);
	}
	public Card getCard(int _index) {
		return this.cards.get(_index);
	}
	public ArrayList<Card> getCard(CardCode _cardCode) {
		ArrayList<Card> result = new ArrayList<Card>();
		for (Card card : cards) {
			if (card.CardCode().equals(_cardCode)) {
				result.add(card);
			}
		}
		return result;
	}
	public ArrayList<Card> getCard(CardType _cardType) {
		ArrayList<Card> result = new ArrayList<Card>();
		for (Card card : cards) {
			if (card.CardType().equals(_cardType)) {
				result.add(card);
			}
		}
		return result;
	}
	public Card getCard(CardCode _cardCode, CardType _cardType) {
		for (Card card : cards) {
			if (card.CardCode().equals(_cardCode) && card.CardType().equals(_cardType)) {
				return card;
			}
		}
		return null;
	}
	public void sortDeck() {
		if (isEmpty()) return;
		Collections.sort(cards, new Comparator<Card>() {
			@Override
			public int compare(Card card1, Card card2) {
				if (card1.CardValue() < card2.CardValue()) return -1;
				if (card1.CardValue() == card2.CardValue()) return 0;
				if (card1.CardValue() > card2.CardValue()) return 1;
				return 0;
			}
		});
	}
	public void makeEmpty() {
		cards.clear();
	}
}