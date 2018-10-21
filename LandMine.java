/**
 * Created on Dec 4, 2003
 * @author Frank Martens
 *
 * LandMine - A moving landmine critter (Is there such a thing?!)
 * 			ACTION:   If a wall in front, rotate; otherwise infect
 * 						(this is a lazy fly trap because it doesn’t make sure there
 * 						is something to infect and it wastes its move with
 * 						an infect command that does nothing when it could be rotating)
 */
public class LandMine implements Critter
{
  //private char landmineChar = 'L'; // Landmine character
	private char landmineChar = '+'; // Landmine character

  // getChar() - Gets the character for this class
  public char getChar()
  {
    return landmineChar;
  }

  // getMove() - Decides where to move this stupid little critter...
  //				ACTION: See statement about class above
  public int getMove(int front, int back, int right, int left)
  {
    int returnValue = 0; // Return value
    returnValue = 0; //resets the declared move

    if (front != WALL)
    {
      returnValue = INFECT; //If there isn't a wall....INFECT!!
    } else
    {
      //If there is isn't an open space in front, move there....
      returnValue = HOP;
    }
    return returnValue; //returns a move for the critter.
  }
}
