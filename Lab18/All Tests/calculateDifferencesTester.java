import junit.framework.*; 
import java.util.*;

public class calculateDifferencesTester extends TestCase
{
	public void testCalculateDifferences()
	{
		int[] arr = {1, 3, 1, 7};
		int[] diff = {3-1, 1 - 3, 7-1};
		
		int[] ret = ArrayHelper.calculateDifferences(arr);
		assertEquals("Incorrect size of returned array", 3, ret.length);
		assertEquals("Incorrect values int array", true, arrayEquals(diff, ret));
	}
	
	private boolean arrayEquals(int[] a, int[] b)
	{
		if(a.length != b.length)
			return false;
			
		for(int i=0; i < a.length; i++)
		{
			if(a[i] != b[i])
				return false;
		}
		
		return true;
	}
}