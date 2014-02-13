public class Card {
	private int cardValue;
	private CardCode cardCode;
	private CardType cardType;

	public int CardValue() {
		return cardValue;
	}
	public CardCode CardCode() {
		return cardCode;
	}
	public CardType CardType() {
		return cardType;
	}

	public Card(int _cardIndex, CardType _cardType) {
		this.cardType = _cardType;
		this.cardValue = _cardIndex;
		switch (_cardIndex) {
			case 1:
				this.cardCode = CardCode.Three;
				break;
			case 2:
				this.cardCode = CardCode.Four;
				break;
			case 3:
				this.cardCode = CardCode.Five;
				break;
			case 4:
				this.cardCode = CardCode.Six;
				break;
			case 5:
				this.cardCode = CardCode.Seven;
				break;
			case 6:
				this.cardCode = CardCode.Eight;
				break;
			case 7:
				this.cardCode = CardCode.Nine;
				break;
			case 8:
				this.cardCode = CardCode.Ten;
				break;
			case 9:
				this.cardCode = CardCode.Jack;
				break;
			case 10:
				this.cardCode = CardCode.Queen;
				break;
			case 11:
				this.cardCode = CardCode.King;
				break;
			case 12:
				this.cardCode = CardCode.Ace;
				break;
			case 13:
				this.cardCode = CardCode.Two;
				break;
			default:
				this.cardCode = CardCode.Three;
				break;
		}
	}
}

enum CardType {
	Spade, Heart, Diamond, Club
}

enum CardCode {
	Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
}