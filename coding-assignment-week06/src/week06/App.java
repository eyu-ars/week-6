package week06;

/*
 * 2. Create a class called App with a main method.
 */
public class App {

  public static void main(String[] args) {

    // a) Instantiate a Deck and two Players, call the shuffle method on the deck

    // Instantiate a Deck
    Deck deck = new Deck();
    
    //Instantiate players 
    Player player1 = new Player("Player-1");
    Player player2 = new Player("Player-2");
    
    deck.shuffle();

    // b) Using a traditional for loop, iterate 52 times calling the Draw method
    // on the other player each iteration using the Deck you instantiated

    for (int i = 1; i <= 52; i++) {

      if (i % 2 == 0) {
        // draw a card from deck and added to player 1 hand
        player1.getHand().add(deck.draw());
      } else {
        // draw a card from deck and added to player 2 hand
        player2.getHand().add(deck.draw());
      }
    }

    System.out.println(
        "\n--------------" + player1.getName() + " Cards on Hand -----------------------\n");
    for (Card card : player1.getHand()) {
      card.describe();
    }
    
    System.out.println(
        "\n-------------" + player2.getName() + " Cards on Hand ------------------------\n");
    for (Card card : player2.getHand()) {
      card.describe();
    }

    System.out.println("\n-------------------------------------\n");
    /*
     * c) Using a traditional for loop, iterate 26 times and call the flip method for each player.
     */
    Card player1Card = null;
    Card player2Card = null;
    
    for (int i = 1; i <= 26; i++) {

      // flipping cards for player 1 and player 2
      player1Card = player1.flip();
      player2Card = player2.flip();

      // d) Compare the value of each card returned by the two player’s flip methods.
      // Call the incrementScore method on the player whose card has the higher value
      System.out.println(player1.getName() + " Card Value is: " + player1Card.getValue());
      System.out.println(player2.getName() + " Card Value is: " + player2Card.getValue());
      
      if (player1Card.getValue() > player2Card.getValue()) {
        player1.incrementScore();
        System.out.println("Flip winner is: " + player1.getName());
      } else if (player1Card.getValue() < player2Card.getValue()) {
        player2.incrementScore();
        System.out.println("Flip winner is: " + player2.getName());
      } else {
        System.out.println("Flip winner is: No one");
      }
      
      System.out.println(player1.getName() + " Score is: " + player1.getScore());
      System.out.println(player2.getName() + " Score is: " + player2.getScore());
      System.out.println("");
    }



    // e) After the loop, compare the final score from each player
    // f) Print the final score of each player and either “Player 1”, “Player 2”, or “Draw”
    // depending on which score is higher or if they are both the same
    if (player1.getScore() > player2.getScore()) {
      System.out.println("The winner is: " + player1.getName());
    } else if (player1.getScore() < player2.getScore()) {
      System.out.println("The winner is: " + player2.getName());
    } else {
      System.out.println("Draw");
    }
  }

}
