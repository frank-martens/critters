/*
	Hawk Critter,
	by Shafik Amin
*/

public class Hawk implements Critter
{
	private static int count;
	private static double prob;
	private static int totalcount = 0;
	private static boolean flag = false;
	private static long time;

	// this makes it oscillate back and forth
	public char getChar()
	{
		if(Math.random() < 0.5)
			return '~';
		else
			return '^';
	}

	public int getMove(int front, int back, int right, int left)//, int direction)
	{
		flag = true;
		if(front == SAME && back == EMPTY && left == EMPTY && right == EMPTY)
		{
			if ( Math.random() < 0.5 )
				return LEFT;
			return RIGHT;

		}

		if(front ==  SAME && (right ==  SAME || right ==  WALL)
		&& (left ==  SAME || left ==  WALL))
		{
			if(Math.random() < 0.5)
				return LEFT;
			return RIGHT;

		}
		if(front == OTHER && back == SAME)
			return INFECT;


		if(front == EMPTY && back == EMPTY
		&& right == EMPTY && left == EMPTY)
		{
			prob *= 100;
			prob = (prob + 1) % 9;  //change this magic number to tweak, the lower, the more active
			prob /= 100;

			if (Math.random() < prob)
				return  INFECT;

			if (Math.random() < 0.8)
				return  HOP;

			if ( Math.random() < 0.5)
				return LEFT;
			return RIGHT;
		}

		if (front == EMPTY && left != OTHER && right != OTHER)
			return HOP;
		if (front ==  OTHER)
			return INFECT;

		// basically just simple 'intelligence'
		else
		{
			if (right == OTHER)
				return RIGHT;
			if (left == OTHER)
				return  LEFT;
			if (back == OTHER)
			{
				if (Math.random() < 0.5)
					return LEFT;
				return RIGHT;
			}

			if (front == WALL)
			{
				if(left == WALL)
					return RIGHT;
				if(right == WALL)
				return LEFT;
			}

			if (front == SAME)
			{
				if (back == SAME)
				{
					if(left == EMPTY)
						return LEFT;
					if(right == EMPTY)
						return RIGHT;
				}
				return INFECT;
			}

			if ( Math.random() < 0.5)
				return LEFT;
			return RIGHT;
		}
	}
}
