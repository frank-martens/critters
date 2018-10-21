/**
 * Created on Dec 5, 2003
 * @author Frank Martens
 *
 * My Critter!
 * Rabbitfish - Rabbitfish or spinefoot (Siganidae species) occur mainly on coral
 * 				reefs in the Indian and Pacific oceans. They have very sharp,
 * 				possibly venomous spines in their fins. Handle them with care, if at
 * 				all. This fish, like many others of the dangerous fish in this section,
 * 				is considered edible by native peoples where the fish are found, but
 * 				deaths occur from careless handling. Seek other nonpoisonous fish
 * 				to eat if at all possible.
 *
 * BUWAHAHAHA (pfff)
 */
public class Rabbitfish implements Critter
{
	// getChar() - Returns the character for this class
	public char getChar()
	{
		// The character changes half the time
		double randomNum = Math.random();
		return '@';
		/*if (randomNum < 0.5)
			return '-';
		else
			return '|';*/
	}

	// getMove() - Moves the darned thing
	public int getMove(int front, int back, int right, int left)
	{
		if (front == OTHER) {
			return INFECT;
		}
		if (left == OTHER) {
			return LEFT;
		}
		if (right == OTHER) {
			return RIGHT;
		}
		if (back == OTHER) {
			if (left == SAME) {
				return LEFT;
			}
			if (right == SAME) {
				return RIGHT;
			}
			if (Math.random() < 0.2) {
				return RIGHT;
			}
			if (Math.random() < 0.2) {
				return LEFT;
			}
			return HOP;
		}
		if (left == SAME) {
			if (Math.random() < 0.1) {
				return LEFT;
			}
		}
		if (right == SAME) {
			if (Math.random() < 0.1) {
				return RIGHT;
			}
		}
		
//		if (Math.random() < 0.2) {
//			return RIGHT;
//		}
//		
//		if (Math.random() < 0.2) {
//			return LEFT;
//		}
		
		return HOP;
	}
}
