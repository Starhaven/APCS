import junit.framework.*; 
import java.util.*;

public class Lab18Tester80 extends TestCase
{
	public void testMean()
	{
		int[] arr = {4, 2, 6, 1};
		
		assertEquals("Returns the incorrect mean", 3.25, ArrayHelper.mean(arr));
	}
	
	public void testValueAt()
	{
		int[] arr = {2, 4, 6, 6, 10};
		
		assertEquals("Returns the incorrect value for index 0", 2, ArrayHelper.valueAt(arr, 0));
		assertEquals("Returns the incorrect value for index 1", 4, ArrayHelper.valueAt(arr, 1));
		assertEquals("Returns the incorrect value for the last index", 10, ArrayHelper.valueAt(arr, 4));
	}
	
		public void testToString()
	{
		int[] arr = {2, 3, 5, 6, 7, 8};
		
		assertEquals("Incorrect String returned", "[2, 3, 5, 6, 7, 8]", ArrayHelper.toString(arr));
	}
	
	public void testToStringLength1()
	{
		int[] arr = {2};
		
		assertEquals("Incorrect String returned", "[2]", ArrayHelper.toString(arr));
	}
	
	public void testSum()
	{
		int[] arr = {2, 3, 4};
		
		assertEquals("Returns the incorrect sum", 9, ArrayHelper.sum(arr));
	}
	
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
	
	public void testMakeRange()
	{
		int[] arr = ArrayHelper.makeRange(4, 100);
		assertEquals("makeRange did not create an array of the correct size", 96, arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			assertEquals("Incorrect value at index " + i, i+4, arr[i]);
		}
	}
	
	public void testMakeRandom()
	{
		int min = 4;
		int max = 7;
		int[] arr = ArrayHelper.makeRandom(10000, min, max);
		assertEquals("makeRange did not create an array of the correct size", 10000, arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			assertEquals("makeRandom should not generate a number less than the small value", true, arr[i] >= min);
			assertEquals("makeRandom should not generate a number equal to the big value", false, arr[i] == max);
			assertEquals("makeRandom should not generate a number bigger than the big value", true, arr[i] < max);
		}
	}
	
	public void testIndexOf()
	{
		int[] arr = {2, 4, 6, 6, 10};
		
		assertEquals("The first value of the array is stored in index 0", 0, ArrayHelper.indexOf(arr, 2));
		assertEquals("Did not correctly find the second value in the array", 1, ArrayHelper.indexOf(arr, 4));
		assertEquals("Did not correctly find the first index of a value that is duplicated", 2, ArrayHelper.indexOf(arr, 6));
		assertEquals("Did not correctly find the index of the last value in the array", 4, ArrayHelper.indexOf(arr, 10));
		assertEquals("Did not return the correct index when the value is not in the array", -1, ArrayHelper.indexOf(arr, 11));
	}
	
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
	
	public void testCount()
	{
		int[] arr = {2, 6, 4, 4, 4, 6, 6, 10, 6};
		
		assertEquals("Returns the incorrect count for a value that exists once", 1, ArrayHelper.count(arr, 2));
		assertEquals("Returns the incorrect count for a value that is repeated consecutively", 3, ArrayHelper.count(arr, 4));
		assertEquals("Returns the incorrect count for a value that is repeated non-consecutively", 4, ArrayHelper.count(arr, 6));
		assertEquals("Returns the incorrect count for a value that does not exist in the array", 0, ArrayHelper.count(arr, 0));
	}
	
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