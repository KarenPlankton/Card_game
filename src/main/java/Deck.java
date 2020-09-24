import java.util.ArrayList;
import java.util.Collections;

public class Deck
  {
      private ArrayList<Card> cards;


      public Deck(){
          this.cards=new ArrayList<Card>();

      }

      public void createDeck(){

          for (Suit suit : Suit.values()){
              for(Rank rank :Rank.values()){
                  Card card = new Card(suit,rank);
                  this.cards.add(card);
              }
          }
      }

      public void shuffleDeck(){
          Collections.shuffle(this.cards);
  }

      public Card removeCard(){
          return this.cards.remove(0);
      }

//      public void deal() {
//          for (Player player : this.players) {
//              player.receiveCard(getCardFromDeck());
//          }

      }
