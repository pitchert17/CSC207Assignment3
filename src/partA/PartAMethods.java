package partA;

public class PartAMethods {
	/**
	 * Determine if a is a multiple of b.
	 */
	public static boolean isMultiple(long a, long b) {
		if ((a % b == 0) || (b % a == 0))
			return true;
		return false;
	} // isMultiple(long, long)

	/**
	 * Determine if i is an odd number
	 */
	public static boolean isOdd(int i) {
		for (int j = 1; j < Integer.MAX_VALUE; j += 2)
			if (j == i)
				return true;
		return false;
	} // isOdd(int)

	/**
	 * Sums all positive odd numbers less than n
	 */
	public static int oddSumTo(int n) {
		int sum = 0;
		for (int j = 1; j < n; j += 2)
			sum += j;
		return sum;
	} // oddSumTo(int)

	/**
	 * Determine if any pair of numbers has an odd product
	 */
	public static boolean isOddProd(int[] ints) {
		for (int i = 0; i < ints.length; i++)
			for (int j = i + 1; j < ints.length; j++)
				if (isOdd(ints[i] * ints[j]))
					return true;
		return false;
	} // isOddProd(int[])

	/**
	 * Determines if two elements have equal values
	 */
	public static boolean allDistinct(int[] ints) {
		for (int i = 0; i < ints.length; i++)
			for (int j = i + 1; j < ints.length; j++)
				if (ints[i] == ints[j])
					return false;
		return true;
	} // allDistinct(int[])

	/**
	 * Reverses the order of the array
	 */
	public static int[] reverseInts(int[] ints) {
		for (int i = 0; i < (ints.length / 2); i++) {
			int temp = ints[i];
			ints[i] = ints[ints.length - i - 1];
			ints[ints.length - i - 1] = temp;
		}
		return ints;
	} // reverseInts(int[])

} // PartAMethods