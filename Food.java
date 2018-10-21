/**
 * Created on Dec 4, 2003
 * @author Frank Martens
 *
 * Food - Food class (FOOD For those darned critters), ACTION: Always rotate left
 */
public class Food implements Critter
{
  private char foodChar = 'F'; // The food critter character

  // getChar() - Returns the character for this class
  public char getChar()
  {
    return foodChar; //returns the food character
  }

  // getMove() - Decides where to move the critter, As stated above... alwasy rotate left
  public int getMove(int front, int back, int right, int left)
  {
    return LEFT;
  }
}
