import java.util.ArrayList;

public class Game {

    Deck deck;
    Dealer dealer;
    private ArrayList<Player> players;

    public Game(ArrayList players ){

        this.deck= new Deck();
        this.dealer=new Dealer(this.deck,players);
        this.players= players;
    }

      public int findWinner(){
        String winnerName = "";
        int winner = 0;
        for (Player player: players){
            System.out.println("Current player "+player.getName());
            System.out.println("Current player value "+player.handValue());
            int value = player.handValue();
            if (winner < value) {
                winnerName= player.getName();
                winner = value;
            }

        }
        System.out.println("The winner is: "+ winnerName);
        return winner;
      }

}
