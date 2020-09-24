import java.util.ArrayList;

public class Dealer {



    private Deck deck;
    private ArrayList<Player> players;

    public Dealer(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<Player>();
    }


    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int playerCount(){
        return this.players.size();
    }


    public Card getCardFromDeck(){
        return deck.removeCard();
    }


    public void deal() {
        for (Player player : this.players) {
            player.takeCard(getCardFromDeck());
        }

    }


}


