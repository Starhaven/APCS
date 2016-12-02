import junit.framework.*; 
import java.util.*;

public class countTester extends TestCase
{
	public void testCount()
	{
		int[] arr = {2, 6, 4, 4, 4, 6, 6, 10, 6};
		
		assertEquals("Returns the incorrect count for a value that exists once", 1, ArrayHelper.count(arr, 2));
		assertEquals("Returns the incorrect count for a value that is repeated consecutively", 3, ArrayHelper.count(arr, 4));
		assertEquals("Returns the incorrect count for a value that is repeated non-consecutively", 4, ArrayHelper.count(arr, 6));
		assertEquals("Returns the incorrect count for a value that does not exist in the array", 0, ArrayHelper.count(arr, 0));
	}
}