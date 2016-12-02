import junit.framework.*; 
import java.util.*;

public class indexOfTester extends TestCase
{
	public void testIndexOf()
	{
		int[] arr = {2, 4, 6, 6, 10};
		
		assertEquals("The first value of the array is stored in index 0", 0, ArrayHelper.indexOf(arr, 2));
		assertEquals("Did not correctly find the second value in the array", 1, ArrayHelper.indexOf(arr, 4));
		assertEquals("Did not correctly find the first index of a value that is duplicated", 2, ArrayHelper.indexOf(arr, 6));
		assertEquals("Did not correctly find the index of the last value in the array", 4, ArrayHelper.indexOf(arr, 10));
		assertEquals("Did not return the correct index when the value is not in the array", -1, ArrayHelper.indexOf(arr, 11));
	}
}