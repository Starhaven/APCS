import junit.framework.*; 
import java.util.*;

public class valueAtTester extends TestCase
{
	public void testValueAt()
	{
		int[] arr = {2, 4, 6, 6, 10};
		
		assertEquals("Returns the incorrect value for index 0", 2, ArrayHelper.valueAt(arr, 0));
		assertEquals("Returns the incorrect value for index 1", 4, ArrayHelper.valueAt(arr, 1));
		assertEquals("Returns the incorrect value for the last index", 10, ArrayHelper.valueAt(arr, 4));
	}
}