package week06;

//1. a  Create Card class
public class Card {

  private String name;
  private int value;

  /**
   * Creates an instance of the Card class.
   * @param name string name of card
   * @param value int value of card
   */
  public Card(String name, int value) {
    this.name = name;
    this.value = value;
  }

  /*
   * Creating getters and setters
   */
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  /**
   * Print out the description of the card.
   */
  public void describe () {
    System.out.println(this.name);
  }

}
