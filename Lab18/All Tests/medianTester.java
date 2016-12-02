import junit.framework.*; 
import java.util.*;

public class medianTester extends TestCase
{
	public void testMedianEven()
	{
		int[] arr = {1, 2, 5, 7};
		
		assertEquals("Returns the incorrect median when there is an even number of elements", 3.5, ArrayHelper.median(arr));
	}
	
	public void testMedianOdd()
	{
		int[] arr = {1, 2, 5, 7, 9};
		
		assertEquals("Returns the incorrect median when there is an odd number of elements", 5.0, ArrayHelper.median(arr));
	}
}