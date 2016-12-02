import java.util.Arrays;

public class ArrayTester_ASK
{
	public static void main(String[] args)
	{
		//Write code here to test your ArrayHelper methods!
		System.out.println("Make Range : "+Arrays.toString(ArrayHelper_ASK.makeRange(3, 5)));
		System.out.println("Make Random : "+Arrays.toString(ArrayHelper_ASK.makeRandom(3, 8, 15)));
		System.out.println("IndexOf : "+ArrayHelper_ASK.indexOf(new int[]{3,5,7,4,3,5,6},5));
		System.out.println("Value At : "+ArrayHelper_ASK.valueAt(new int[]{3,5,7,4,3,5,6},4));
		System.out.println("Count : "+ArrayHelper_ASK.count(new int[]{3,5,7,4,3,5,6},3));
		System.out.println("toString : "+ArrayHelper_ASK.toString(new int[]{3,5,7,4,3,5,6}));
		System.out.println("Sum : "+ArrayHelper_ASK.sum(new int[]{3,5,7,4,3,5,6}));
		System.out.println("getSmallest : "+ArrayHelper_ASK.getSmallest(new int[]{5,7,4,5,6}));
		System.out.println("getSmallestIndex : "+ArrayHelper_ASK.getSmallestIndex(new int[]{5,7,4,5,6}));
		System.out.println("Mean : "+ArrayHelper_ASK.mean(new int[]{3,6,1,7}));
		System.out.println("Mode : "+ArrayHelper_ASK.mode(new int[]{2,2,2,3,3,4,4,4,4,5,7,9}));
		System.out.println("Median : "+ArrayHelper_ASK.median(new int[]{2,3,4,5,7,8,9,10,10,11,11}));
		System.out.println("nonDecreasing : "+ArrayHelper_ASK.nonDecreasing(new int[]{1,2,3,4,5}));
		System.out.println("Calculate Differences : "+Arrays.toString(ArrayHelper_ASK.calculateDifferences(new int[]{4, 2, 6, 4, 8, 1, 4, 8})));
		System.out.println("Add : "+Arrays.toString(ArrayHelper_ASK.add(new int[]{3,5,7,4,3,5,6},10)));
		System.out.println("Remove : "+Arrays.toString(ArrayHelper_ASK.remove(new int[]{1,3,1,7},0)));
		System.out.println("Split : "+Arrays.toString(ArrayHelper_ASK.split("Hello my name is Aadhithya Kannan.")));
	}
}