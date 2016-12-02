import junit.framework.*; 
import java.util.*;

public class modeTester extends TestCase
{
	public void testMode()
	{
		int[] arr = {1, 1, 2, 3, 3, 4, 4, 4, 5};
		
		assertEquals("Returns the incorrect mode", 4, ArrayHelper.mode(arr));
	}
	
	public void testModeFirst()
	{
		int[] arr = {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3};
		
		assertEquals("Returns the incorrect mode when the first value is the mode", 1, ArrayHelper.mode(arr));
	}
	
	public void testModeLast()
	{
		int[] arr = {1, 1, 2, 2, 3, 3, 3, 3};
		
		assertEquals("Returns the incorrect mode when the last value is the mode", 3, ArrayHelper.mode(arr));
	}
	
	public void testModeOne()
	{
		int[] arr = {7};
		
		assertEquals("Returns the incorrect mode when there is only 1 value in the array", 7, ArrayHelper.mode(arr));
	}
	
	public void testModeSame()
	{
		int[] arr = {7, 7, 7, 7};
		
		assertEquals("Returns the incorrect mode when all values are the same", 7, ArrayHelper.mode(arr));
	}
}