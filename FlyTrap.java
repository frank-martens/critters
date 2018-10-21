/**
 * Created on Dec 4, 2003
 * @author Frank Martens
 *
 * FlyTrap - A moving flytrap critter, ACTION: If another critter in front, 
 * 												infect, otherwise rotate left.
 */
public class FlyTrap implements Critter
{
  //private char flytrapChar = 'T'; // Flytrap character
  private char flytrapChar = '_'; // Flytrap character
  // getChar() - Returns the flytrap character
  public char getChar()
  {
    return flytrapChar; // Return the flytrap character
  }

  // getMove() - Accepts 5 values and defines how this critter moves
  //			about in the program.
  public int getMove(int front, int back, int right, int left)
  {
    int returnValue = 0; // Return value to return
    returnValue = 0; // reset

    if (front != EMPTY)
    {
      // Check to see if something is in front of this critter
      // Check to see if a some OTHER critter
      if (front == OTHER)
      {
        // Other critter in front... so infect
        returnValue = INFECT;
      } else if (front == WALL || front == SAME)
      {
        // Well... if there's a wall in front or the same critter... rotate left
        returnValue = LEFT;
      } else
      {
        // all other cases... just hop
        returnValue = HOP;
      }
    }
    // Return what was decided upon
    return returnValue;
  }
}