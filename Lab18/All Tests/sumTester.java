import junit.framework.*; 
import java.util.*;

public class sumTester extends TestCase
{
	public void testSum()
	{
		int[] arr = {2, 3, 4};
		
		assertEquals("Returns the incorrect sum", 9, ArrayHelper.sum(arr));
	}
}