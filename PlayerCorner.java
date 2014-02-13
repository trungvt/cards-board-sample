public class PlayerCorner {
	public static int currentCornerId = 0;
	private int cornerId;
	private Player player;
	private Deck deck;
	private boolean cardRemaining;

	public int CornerId() {
		return cornerId;
	}
	public Player Player() {
		return player;
	}
	public Deck Deck() {
		return deck;
	}
	public boolean CardRemaining() {
		return !deck.isEmpty();
	}

	public PlayerCorner(Player _player) {
		currentCornerId++;
		this.cornerId = currentCornerId;
		this.player = _player;
	}
}