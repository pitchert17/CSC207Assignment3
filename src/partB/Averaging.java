package partB;

import java.math.BigInteger;

public class Averaging {
	 /**
	* Compute the average of two integers. Rounds toward zero if the
	* average is not a whole number.
	*/
	public static int average(int left, int right)
	{
	BigInteger bigRight = BigInteger.valueOf(right);
	BigInteger bigLeft = BigInteger.valueOf(left);
	return (bigRight.add(bigLeft).divide(BigInteger.valueOf(2))).intValue();
	} // average(int,int)
	} // class Averaging

