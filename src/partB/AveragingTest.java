package partB;

import static org.junit.Assert.*;

import org.junit.Test;

public class AveragingTest {

	@Test
	public void testAverage() {
		assertEquals(Integer.MAX_VALUE,
				partB.Averaging.average(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}
}