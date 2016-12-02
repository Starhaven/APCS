import junit.framework.*; 
import java.util.*;

public class getSmallestIndexTester extends TestCase
{
	public void testGetSmallestIndexFirst()
	{
		int[] arr = {2, 3, 4, 5};
		
		assertEquals("Returns the wrong index when first value is the smallest", 0, ArrayHelper.getSmallestIndex(arr));
	}
	
	public void testGetSmallestIndexLast()
	{
		int[] arr = {2, 3, 4, 1};
		
		assertEquals("Returns the wrong index when first value is the smallest", 3, ArrayHelper.getSmallestIndex(arr));
	}
	
	public void testGetSmallestIndexMiddle()
	{
		int[] arr = {2, 3, 1, 5};
		
		assertEquals("Returns the wrong index when a middle value is the smallest", 2, ArrayHelper.getSmallestIndex(arr));
	}
	
	public void testGetSmallestIndexAllSame()
	{
		int[] arr = {1, 1, 1, 1};
		
		assertEquals("Returns the wrong index when all values are the same", 0, ArrayHelper.getSmallestIndex(arr));
	}
	
	public void testGetSmallestIndexNegative()
	{
		int smallest = Integer.MIN_VALUE;
		int[] arr = {2, 4, 3, smallest};
		
		assertEquals("Returns the wrong index when the smallest value is negative", 3, ArrayHelper.getSmallestIndex(arr));
	}
	
	public void testGetSmallestIndexAllNegatives()
	{
		int[] arr = {-2, -4, -7, -3};
		
		assertEquals("Returns the wrong index when all values are negative", 2, ArrayHelper.getSmallestIndex(arr));
	}
}