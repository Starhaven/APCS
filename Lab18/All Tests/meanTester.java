import junit.framework.*; 
import java.util.*;

public class meanTester extends TestCase
{
	public void testMean()
	{
		int[] arr = {4, 2, 6, 1};
		
		assertEquals("Returns the incorrect mean", 3.25, ArrayHelper.mean(arr));
	}
}