public class TrailRunner_ASK
{
	public static void main(String[] args)
	{
		int[] data = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		
		Trail_ASK t = new Trail_ASK(data);
		
		boolean level = t.isLevelTrailSegment(7, 10);
		System.out.println("isLevelTrailSegment(7, 10) should return true; actually returned " + level);
		
		level = t.isLevelTrailSegment(2, 12);
		System.out.println("isLevelTrailSegment(0, 3)  should return false; actually returned " + level);
		
		boolean difficult = t.isDifficult();
		System.out.println("isDifficult() should return true; actually returned " + difficult);
	}
}