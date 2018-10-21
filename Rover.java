/**
 * Created on Dec 4, 2003
 * @author Frank Martens
 *
 * Rover - A roving lunatic critter (hah)
 * 		ACTION: Always hop forward if possible;
 * 			otherwise infect if an enemy is in front; 
 * 			otherwise randomly turn left or right
 */
public class Rover implements Critter
{
  //private char roverChar = 'R'; // Rover character
	private char roverChar = '-'; // Rover character
  // getChar() - Returns the character for this critter
  public char getChar()
  {
    return roverChar;
  }

  // getMove() - Returns the action for this critter
  public int getMove(int front, int back, int right, int left)
  {
	int returnValue = 0; // return variable
	double randomNum = 0.0; // Some random number
	
    // Check to see if whatever is infront is some other thing
    if (front == OTHER)
    {
      returnValue = INFECT; /// DIE DIE DIE!!! (not ssdd)
    } else
    {
      // nope some other thing...
      // check to see if spot in front is empty
      if (front == EMPTY)
      {
        // it is... so just hop forward
        returnValue = HOP;
      } else
      {
        // not empty... <G> only other thing to do is move left or right
        // half the time go left, the other half... go right
        randomNum = Math.random();
        if (randomNum <= .5)
        {
          returnValue = LEFT;
        } else
        {
          returnValue = RIGHT;
        }
      }
    }
    return returnValue; //returns the declared move
  }
}
