import junit.framework.*; 
import java.util.*;

public class getSmallestTester extends TestCase
{
	public void testGetSmallestFirst()
	{
		int[] arr = {2, 3, 4, 5};
		
		assertEquals("Returns the wrong value when first value is the smallest", 2, ArrayHelper.getSmallest(arr));
	}
	
	public void testGetSmallestLast()
	{
		int[] arr = {2, 3, 4, 1};
		
		assertEquals("Returns the wrong value when first value is the smallest", 1, ArrayHelper.getSmallest(arr));
	}
	
	public void testGetSmallestMiddle()
	{
		int[] arr = {2, 3, 1, 5};
		
		assertEquals("Returns the wrong value when a middle value is the smallest", 1, ArrayHelper.getSmallest(arr));
	}
	
	public void testGetSmallestAllSame()
	{
		int[] arr = {1, 1, 1, 1};
		
		assertEquals("Returns the wrong value when all values are the same", 1, ArrayHelper.getSmallest(arr));
	}
	
	public void testGetSmallestNegative()
	{
		int smallest = Integer.MIN_VALUE;
		int[] arr = {2, 4, 3, smallest};
		
		assertEquals("Returns the wrong value when the smallest value is negative", smallest, ArrayHelper.getSmallest(arr));
	}
	
	public void testGetSmallestAllNegatives()
	{
		int[] arr = {-2, -4, -7, -3};
		
		assertEquals("Returns the wrong value when all values are negative", -7, ArrayHelper.getSmallest(arr));
	}
}