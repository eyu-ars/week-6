package week06;

import java.util.ArrayList;
import java.util.List;

// 1. c Create Player class
public class Player {

  // 1.c.i. Creating Player class Fields
  private List<Card> hand = new ArrayList<Card>();
  private int score;
  private String name;

  public Player(String name) {
    this.name = name;
    // initial player score is 0
    this.score = 0;
  }

  public List<Card> getHand() {
    return hand;
  }

  public int getScore() {
    return score;
  }

  public String getName() {
    return name;
  }


  /*
   * //1.c.ii. Creating Player class methods
   * 
   * 1. describe (prints out information about the player and calls the describe method for each
   * card in the Hand List)
   */
  
  /**
   * Printout player information with all of the cards on hand.
   */
  public void describe() {

    System.out.println(this.name);

    for (Card card : hand) {
      card.describe();
    }
  }


  /*
   * 2. flip (removes and returns the top card of the Hand)
   */
  
  /**
   * Flips the first card from the players hand and returns it.
   * @return Card
   */
  public Card flip() {

    return this.hand.remove(0);
  }


  /*
   * 3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned
   * Card to the hand field)
   */
  
  /**
   * Draws a card from the deck and adds it to the players hand.
   * @param deck Deck type 
   */
  public void draw(Deck deck) {

    this.hand.add(deck.draw());
  }



  // 4. incrementScore (adds 1 to the Player’s score field)

  /**
   * . Increments the players score by one.
   */
  public void incrementScore() {
    this.score += 1;
  }
}
