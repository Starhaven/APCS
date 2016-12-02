import junit.framework.*; 
import java.util.*;

public class makeRangeTester extends TestCase
{
	public void testMakeRange()
	{
		int[] arr = ArrayHelper.makeRange(4, 100);
		assertEquals("makeRange did not create an array of the correct size", 96, arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			assertEquals("Incorrect value at index " + i, i+4, arr[i]);
		}
	}
}