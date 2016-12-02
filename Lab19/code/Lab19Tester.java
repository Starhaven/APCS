import junit.framework.*; 
import java.util.*;

public class Lab19Tester extends TestCase
{
	public void testIsLevelTrail_ASKSegment()
	{
		int[] data = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		Trail_ASK t = new Trail_ASK(data);
		boolean level = t.isLevelTrailSegment(7, 10);
		assertEquals("isLevelTrail_ASKSegment does not return true when Trail_ASK segment is level", true, level);
	}
	
	public void testIsNotLevelTrail_ASKSegment()
	{
		int[] data = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		Trail_ASK t = new Trail_ASK(data);
		
		boolean level = t.isLevelTrailSegment(2, 12);
		assertEquals("isLevelTrail_ASKSegment does not return false when Trail_ASK segment is not level", false, level);
	}
	
	public void testisDifficult()
	{
		int[] data = {100, 160, 130, 140, 120, 150};
		Trail_ASK t = new Trail_ASK(data);
		
		boolean difficult = t.isDifficult();
		assertEquals("isDifficult does not return true when Trail_ASK is difficult", true, difficult);
	}
	
	public void testisEndDifficult()
	{
		int[] data = {100, 100, 130, 160, 130};
		Trail_ASK t = new Trail_ASK(data);
		
		boolean difficult = t.isDifficult();
		assertEquals("isDifficult does not return true when Trail_ASK is difficult (last pair of elevations >= 30)", true, difficult);
	}
	
	public void testisBeginningDifficult()
	{
		int[] data = {100, 130, 160, 170, 180, 190, 160};
		Trail_ASK t = new Trail_ASK(data);
		
		boolean difficult = t.isDifficult();
		assertEquals("isDifficult does not return true when Trail_ASK is difficult (first pair of elevations >= 30)", true, difficult);
	}
	
	public void testisNotDifficult()
	{
		int[] data = {100, 130, 129, 160, 131};
		Trail_ASK t = new Trail_ASK(data);
		
		boolean difficult = t.isDifficult();
		assertEquals("isDifficult does not return false when Trail_ASK is difficult", false, difficult);
	}
}