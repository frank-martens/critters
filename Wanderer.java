/**
 * Created on Dec 4, 2003
 * @author Frank Martens
 *
 * Wanderer - A critter that wanders around
 * 		ACTION:  If an enemy is in front, infect;
 * 			otherwise if another wanderer in front, randomly turn left or right;
 * 			otherwise 75% of the time hop and 25% of the time randomly turn left or right
 */
public class Wanderer implements Critter
{
  //private char wandererChar = 'W'; //variable to hold the Wanderer character
	private char wandererChar = '='; //variable to hold the Wanderer character
  // getChar() - Returns the character for this critter
  public char getChar()
  {
    return wandererChar;
  }

  // getMove() - Decides the ACTION for this critter... SEE ACTION Above
  public int getMove(int front, int back, int right, int left)
  {
    int returnValue = 0; // the return value
    boolean frontSame = false; // checks to see if same 

    // check to see if whatever in front is an other
    if (front == OTHER)
    {
      returnValue = INFECT; // Infect
    } else
    {
      // When the Wanderer runs into its same kind 50% of the time it turns left or right.
      // 25% of the time it hops.
      if (front == SAME)
      {
        // sets boolean true if there is a same critter in frontf
        frontSame = true;
        returnValue = randomVal(frontSame);
      } else
      {
        //sets the boolean to false if there isn't a same critter in front
        frontSame = false;
        returnValue = randomVal(frontSame);
      }
    }
    return returnValue;
  }

  // randomVal() - Randomly determines where to send the critter
  public int randomVal(boolean sameFront)
  {
    int wMove; // Return value for this function
    //returns the move
    double randomMove = Math.random(); // figure out the random place to move

    if (sameFront == true)
    {
      //when the same character is in front
      if (randomMove <= .5)
      {
        //25% the time the critter wanders left
        wMove = LEFT; //passes the LEFT move
      } else
      {
        //25% of the time the critter wanders right; pases the RIGHT move
        wMove = RIGHT;
      }
    } else
    {
      if (randomMove <= .75)
      {
        //another 25% of the time the wanderer hops
        wMove = HOP;
      } else
      {
        wMove = randomVal(true); // call again to mix crap up (recursion baby)
      }
    }
    return wMove;
  }
}