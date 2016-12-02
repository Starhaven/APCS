import junit.framework.*; 
import java.util.*;

public class nonDecreasingTester extends TestCase
{
	public void testNonDecreasing()
	{
		int[] arr = {-1, 0, 2, 4,  104};
		
		assertEquals("Does not correctly detect a non decreasting array", true, ArrayHelper.nonDecreasing(arr));
	}
	
	public void testSame()
	{
		int[] arr = {2, 2, 2, 2, 2, 2, 2};
		
		assertEquals("Does not correctly detect a non decreasting array when values are the same", true, ArrayHelper.nonDecreasing(arr));
	}
	
	public void testDecreasing()
	{
		int[] arr = {104, 4, 2, 0, -1};
		
		assertEquals("Does not correctly detect a decreasting array", false, ArrayHelper.nonDecreasing(arr));
	}
	
	
	public void testDecreasingLast()
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 5};
		
		assertEquals("Does not correctly detect a decreasting array when only the last value is decreasing", false, ArrayHelper.nonDecreasing(arr));
	}
	
	
	public void testDecreasingFirst()
	{
		int[] arr = {2, 1, 3, 4, 5, 6};
		
		assertEquals("Does not correctly detect a decreasting array when only the first value is decreasing", false, ArrayHelper.nonDecreasing(arr));
	}
	
	public void testDecreasingMiddle()
	{
		int[] arr = {1, 2, 3, 2, 4, 5, 6};
		
		assertEquals("Does not correctly detect a decreasting array when only one value is decreasing", false, ArrayHelper.nonDecreasing(arr));
	}
}