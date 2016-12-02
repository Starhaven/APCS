import junit.framework.*; 
import java.util.*;

public class makeRandomTester extends TestCase
{
	public void testMakeRandom()
	{
		int min = 4;
		int max = 7;
		int[] arr = ArrayHelper.makeRandom(10000, min, max);
		assertEquals("makeRange did not create an array of the correct size", 10000, arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			assertEquals("makeRandom should not generate a number less than the small value", true, arr[i] >= min);
			assertEquals("makeRandom should not generate a number equal to the big value", false, arr[i] == max);
			assertEquals("makeRandom should not generate a number bigger than the big value", true, arr[i] < max);
		}
	}
}