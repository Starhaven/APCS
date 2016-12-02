import junit.framework.*; 
import java.util.*;

public class splitTester extends TestCase
{
	public void testSplit()
	{
		String str = "A long time ago in a galaxy far far away";
		String[] arr = str.split(" ");
		
		String[] ret = ArrayHelper.split(str);

		assertEquals("Incorrect size of returned array", 10, ret.length);
		assertEquals("Incorrect values in array", true, arrayEquals(arr, ret));
	}
	
	private boolean arrayEquals(String[] a, String[] b)
	{
		if(a.length != b.length)
			return false;
			
		for(int i=0; i < a.length; i++)
		{
			if(a == null || b == null || !a[i].equals(b[i]))
				return false;
		}
		
		return true;
	}
}