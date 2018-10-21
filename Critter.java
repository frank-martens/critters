//Stuart Reges
//1/26/01
//
//The Critter interface specifies the methods a class must implement
// to be able to participate in the critter simulation. It must 
// return a character when getChar is called that will be used for 
// displaying it on the screen.  The getMove method must return a 
// legal move given the current surroundings.
//
//The move should be specified using the constants of the
// CritterModel class (HOP, LEFT, RIGHT, INFECT). 
// The four parameters to getMove specify what issurrounding the 
// critter using constants from the CritterConstants class
// (WALL, EMPTY, SAME, OTHER).

public interface Critter extends CritterConstants
{
  public char getChar();

  public int getMove(int front, int back, int left, int right);
  
  //public int getMove(int front, int back, int left, int right, int direction);
}