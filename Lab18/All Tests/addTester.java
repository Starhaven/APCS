import junit.framework.*; 
import java.util.*;

public class addTester extends TestCase
{
	public void testAdd()
	{
		int[] arr = {1, 3, 1, 7};
		int[] arr2 = {1, 3, 1, 7, 9};
		
		int[] ret = ArrayHelper.add(arr, 9);
		assertEquals("Incorrect size of returned array", 5, ret.length);
		assertEquals("Incorrect values int array", true, arrayEquals(arr2, ret));
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