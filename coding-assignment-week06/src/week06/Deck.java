package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. b Create Deck class
public class Deck {

  // 1. cards (List of Card)
  private List<Card> cards = new ArrayList<Card>();

  // Ace of Diamonds, or Two of Hearts
  /*
   * 3. In the constructor, when a new Deck is instantiated, the Cards field should be populated
   * with the standard 52 cards
   */
  Deck() {


    String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
    String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Jack", "Queen", "King", "Ace"};
    int value = 0;
    // Iterating through suits array
    for (String suit : suits) {
      value = 2;
      // Iterating through numbers array
      for (String number : numbers) {
        // Adding a single card to List of cards
        this.cards.add(new Card(number + " of " + suit, value));
        //Incrementing value by 1
        value++;
      }
    }

  }

  public List<Card> getCards() {
    return cards;
  }

  
  //1. shuffle (randomizes the order of the cards)
  
  /**
   * Shuffles the cards putting them in a random order.
   */
  public void shuffle() {
    Collections.shuffle(this.cards);
  }

  
  // 2. draw (removes and returns the top card of the Cards field)
  
  /**
   * Draws a card from the deck.
   * @return The card that was draw.
   */
  public Card draw() {
    Card card = this.cards.remove(0);
    return card;
  }
}
