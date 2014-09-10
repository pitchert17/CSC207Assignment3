package partA;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartAMethodsTest {

	@Test
	public void testIsMultiple() {
		for (int i = 1; i < 9999999; i++) {
			assertEquals(true, partA.PartAMethods.isMultiple(1, i));
		}
	}

	@Test
	public void testIsOdd() {
		for (int i = 1; i < 99999; i += 2) {
			assertEquals(true, partA.PartAMethods.isOdd(i));
		}
	}

	@Test
	public void testOddSumTo() {
		assertEquals(4, partA.PartAMethods.oddSumTo(5));
		assertEquals(4, partA.PartAMethods.oddSumTo(4));
		assertEquals(9, partA.PartAMethods.oddSumTo(6));
		assertEquals(100, partA.PartAMethods.oddSumTo(20));
	}

	@Test
	public void testIsOddProd() {
		int[] testArray = { 3, 1 };
		int[] testArray2 = { 3, 5 };
		int[] testArray3 = { 5, 7 };
		int[] testArray4 = { 25, 5 };
		assertEquals(true, partA.PartAMethods.isOddProd(testArray));
		assertEquals(true, partA.PartAMethods.isOddProd(testArray2));
		assertEquals(true, partA.PartAMethods.isOddProd(testArray3));
		assertEquals(true, partA.PartAMethods.isOddProd(testArray4));
	}

	@Test
	public void testAllDistinct() {
		int[] testArray = { 3, 1 };
		int[] testArray2 = { 1, 2, 3, 4, 5, 6 };
		int[] testArray3 = { 88, -93, 64, 2, 44 };
		assertEquals(true, partA.PartAMethods.allDistinct(testArray));
		assertEquals(true, partA.PartAMethods.allDistinct(testArray2));
		assertEquals(true, partA.PartAMethods.allDistinct(testArray3));
	}

	@Test
	public void testReverseInts() {
		int[] testArray = { 1, 2, 3 };
		int[] testArrayReversed = { 3, 2, 1 };
		int[] testArray2 = { 1, 2, 3, 4, 5 };
		int[] testArrayReversed2 = { 5, 4, 3, 2, 1 };
		int[] testArray3 = { 8, 12, 5, 1, 4, 4, 13, 12 };
		int[] testArrayReversed3 = { 12, 13, 4, 4, 1, 5, 12, 8 };
		assertArrayEquals(testArrayReversed,
				partA.PartAMethods.reverseInts(testArray));
		assertArrayEquals(testArrayReversed2,
				partA.PartAMethods.reverseInts(testArray2));
		assertArrayEquals(testArrayReversed3,
				partA.PartAMethods.reverseInts(testArray3));
	}
}