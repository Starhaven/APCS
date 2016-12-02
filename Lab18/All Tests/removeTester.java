import junit.framework.*; 
import java.util.*;

public class removeTester extends TestCase
{
	public void testRemove()
	{
		int[] arr = {1, 3, 1, 7};
		int[] arr2 = {1, 3, 7};
		
		int[] ret = ArrayHelper.remove(arr, 2);
		assertEquals("Incorrect size of returned array", 3, ret.length);
		assertEquals("Incorrect values int array", true, arrayEquals(arr2, ret));
	}
	
	public void testRemoveFirst()
	{
		int[] arr = {1, 3, 1, 7};
		int[] arr2 = {3, 1, 7};
		
		int[] ret = ArrayHelper.remove(arr, 0);
		assertEquals("Incorrect size of returned array", 3, ret.length);
		assertEquals("Incorrect values int array", true, arrayEquals(arr2, ret));
	}
	
	public void testRemoveLast()
	{
		int[] arr = {1, 3, 1, 7};
		int[] arr2 = {1, 3, 1};
		
		int[] ret = ArrayHelper.remove(arr, 3);
		assertEquals("Incorrect size of returned array", 3, ret.length);
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