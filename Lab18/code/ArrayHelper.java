import java.util.HashMap;

public class ArrayHelper_ASK
{
	/**
	 *	Return an array of ints with values between from and to, exclusive
	 *	Exmaple:
	 *	  makeRange(3, 7) should return an array with values:
	 *		[3, 4, 5, 6]
	 *
	 *	Precondition: 0 < from < to
	 */
	public static int[] makeRange(int from, int to)
	{
		int[] array = new int[to-from];
		int counter = 0;
		for (int i = from; i < to; i++){
			array[counter] = i;
			counter++;
		}
		return array;
	}
	
	/**
	 *	Return an array of ints with n elements. Each value is
	 *	a randomly generated number between small and big, exclusive
	 *
	 *	Precondition: n > 0
	 */
	public static int[] makeRandom(int n, int small, int big)
	{
		int[] array = new int[n];
		for (int i = 0; i < n; i++){
			array[i]=(int) (Math.random()*(big-small)+small);
		}
		return array;
	}
	
	/**
	 *	Return the index of the first occurance of needle in haystack
	 *	Return -1 if needle does not exist in haystack
	 */
	public static int indexOf(int[] haystack, int needle)
	{
		int counter = -1;
		for (int i : haystack){
			counter++;
			if (i == needle)
				return counter;
		}
		return -1;
	}
	
	/**
	 *	Return the value stored in haystack at index 
	 *  Precondition: index >= 0 && index < haystack.length
	 */
	public static int valueAt(int[] haystack, int index)
	{
		return haystack[index];
	}
	
	/**
	 *	Return the number of times needle occurs in haystack
	 */
	public static int count(int[] haystack, int needle)
	{
		int counter = 0;
		for (int i : haystack){
			if (i==needle)
				counter++;
		}
		return counter;
	}
	
	/**
	 *	Return a String representation of the values stored in the haystack
	 *	Example:
	 *		int[] arr = {2, 4, 6, 8};
	 *		toString(arr) returns:
	 *
	 *			"[2, 4, 6, 8]"
	 *
	 *		Notice that the data is separated by a , and a space
	 *		also notice that the data is wrapped in square brackets [ ]
	 *		Your data must match this format EXACTLY
	 *
	 *	Precondition: haystack.length > 0
	 */
	public static String toString(int[] haystack)
	{
		String string = "[";
		for (int i : haystack){
			string +=i+", ";
		}
		string = string.substring(0,string.length()-2)+"]";
		return string;
	}
	
	/**
	 *	Return the sum of all of the values in haystack
	 */
	public static int sum(int[] haystack)
	{
		int sum = 0;
		for (int i : haystack){
			sum+=i;
		}
		return sum;
	}
	
	/**
	 *	Return the smallest value stored in haystack
	 *	Example:
	 *		int[] arr = {3, 6, 1, 8, 7, 1, 2, 5}
	 *      getSmallest(arr) will return 1
	 */
	public static int getSmallest(int[] haystack)
	{
		int smallest = haystack[0];
		for (int i : haystack){
			if (smallest>i){
				smallest = i;
			}
		}
		return smallest;
	}
	
	/**
	 *	Return the index of the first occurance of the smallest value
	 *	in haystack.
	 *	Example:
	 *		int[] arr = {3, 6, 1, 8, 7, 9, 2, 5}
	 *      getSmallest(arr) will return 2 because the smallest value (1) is at index 2
	 */
	public static int getSmallestIndex(int[] haystack)
	{
		return indexOf(haystack,getSmallest(haystack));
	}
	
	/**
	 *	Calculate the mean (average) of the values stored in haystack
	 *	The mean is calcualted by adding all of the values together and
	 *	dividing by the number of values.
	 *		The mean of {3, 6, 1, 7} is 
	 *			  (3 + 6 + 1 + 7) / 4 
	 *			= 17 / 4 
	 *			= 4.25
	 */
	public static double mean(int[] haystack)
	{
		return ((double) sum(haystack))/((double) haystack.length);
	}
	
	/**
	 *	Calculate the mode of hte values stored in haystack.
	 *	The mode is the number that occurs the most number of times
	 *	Example:
	 *		{2, 2, 2, 6, 6, 8, 9, 9}
	 *		The mode is 2 because it occurs 3 times in the array
	 *
	 *	Precondition: haystack is sorted in non-decreasing order
	 */
	public static int mode(int[] haystack)
	{
		if(haystack.length == 1){
			return haystack[0];
		}
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	    int max=1,temp = 0;
	    for(int i=0;i<haystack.length;i++){
	        if(hm.get(haystack[i])!=null){
	            int count=hm.get(haystack[i]);
	            count++;
	            hm.put(haystack[i],count);
	            if(count>max){
	            	max=count;
	                temp=haystack[i];
	            }
	        }
            else
            {
            	hm.put(haystack[i],1);
            }
	    }
	        return temp;
	}
	
	/**
	 *	Calculate the median of the values stored in haystack.
	 *	The median is the number that occurs in the middle of the list
	 *	If there are an even number of elements, then the average of the
	 *	middle two numberes is returned.
	 *	Example:
	 *		{2, 2, 2, 6, 8, 8, 9, 9}
	 *		The median is 7 because the two middle numbers are 6 and 8
	 *		  6 + 8 / 2
	 *		= 14 / 2
	 *		= 7
	 *	Precondition: haystack is sorted in non-decreasing order
	 */
	public static double median(int[] haystack)
	{
		int len = haystack.length;
		if(len%2==0){
			return (double) (haystack[len/2]+haystack[len/2-1])/2;
		}else{
			return  haystack[(int)(len/2)];
		}
	}
	
	/**
	 *	Return true if the values in haystack are in non-decreasing order
	 *	Non-decreasing means: the value at index i+1 is not less than the 
	 *	value at index i
	 *		Non-decreasing: {1, 2, 3, 4}
	 *		Non-decreasing: {2, 2, 2, 2}
	 *		Decreasing:		{1, 2, 1, 4}
	 */
	public static boolean nonDecreasing(int[] haystack)
	{
		boolean bool = true;
		for(int i = 0; i < haystack.length-1; i++){
			if(haystack[i]>haystack[i+1]){
				bool = false;
			}
		}
		return bool;
	}
	
	/**
	 *	Create an array that stores the differences between each consecutive
	 *	value in the haystack
	 *	Example:
	 *		haystack = {4, 2, 6, 4, 8, 1, 4, 8}
	 *		differences = {2-4, 6-2, 4-6, 8-4, 1-8, 4-1, 8-4}
	 *					= { -2,   4,  -2,   4,  -7,   3,   4}
	 */
	public static int[] calculateDifferences(int[] haystack)
	{
		int[] array = new int[haystack.length-1];
		for(int i = 0; i < haystack.length-1; i++){
			array[i]=haystack[i+1]-haystack[i];
		}
		return array;
	}
	
	/**
	 *	Create a new array that is 1 element larger than haystack
	 *	It should contain all the same elements in the same order
	 *	as haystack, plus value as the last element.
	 *
	 *	Example:
	 *		int[] arr = {2, 4, 6, 8}
	 *		add(arr, 10) returns: {2, 4, 6, 8, 10}
	 */
	public static int[] add(int[] haystack, int value)
	{
		int[] array = new int[haystack.length+1];
		int counter = 0;
		for (int i : haystack){
			array[counter]=i;
			counter++;
		}
		array[haystack.length]=value;
		return array;
	}
	
	/**
	 *	Create a new array that is 1 element smaller than haystack
	 *	It should contain all the same elements in the same order
	 *	EXCEPT the element stored at index.
	 *
	 *	Example:
	 *		int[] arr = {2, 4, 6, 8}
	 *		remove(arr, 2) returns {2, 4, 8}
	 */
	public static int[] remove(int[] haystack, int index)
	{
		int[] array = new int[haystack.length-1];
		int counter = 0;
		for (int i : haystack){
			if(counter!=index){
				array[counter]=i;
				counter++;
			}else{
				index=-1;
			}
		}
		return array;
	}
	
	/**
	 *	Return an array that contains each word of the sentence
	 *	stored in an element of the array. 
	 *
	 *	Example:
	 *		sentence = "Once upon a time"
	 *
	 *		Return: {"Once", "upon", "a", "time"}
	 *
	 *	Precondition: sentence only contains letters and spaces
	 */
	public static String[] split(String sentence)
	{
		int counter = 0;
		sentence+=" ";
		String letter = "";
		String word = "";
		int spaces = sentence == null ? 0 : sentence.length() - sentence.replace(" ", "").length();
		String[] array = new String[spaces];
		for(int i=0; i < sentence.length(); i++){
			letter = sentence.substring(i, i+1);
			if (!letter.equals(" ")){
				word+=letter;
			}else{
				array[counter]=word;
				word = "";
				counter++;
			}
		}
		return array;
	}

}