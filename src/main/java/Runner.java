import java.util.ArrayList;

public class Runner {
     public static void main(String[] args) {

         ArrayList<Player> players = new ArrayList<Player>();
         Player player1 = new Player("Fox");
         Player player2= new Player("Beaver");

         players.add(player1);
         players.add(player2);

         Game game1 = new Game(players);
         game1.findWinner();

    }
}
