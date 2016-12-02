import junit.framework.*; 
import java.util.*;

public class toStringTester extends TestCase
{
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
}