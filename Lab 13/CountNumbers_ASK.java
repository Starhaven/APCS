import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 24 October 2016
 * @period - Period 05
 */
public class CountNumbers_ASK
{
	public static void main(String[] args)
	{
		System.out.print("Enter positive and negative numbers. 0 to quit.\n");
		Scanner scan = new Scanner(System.in);
		int input = 'a';
		int pos = 0;
		int min = 0;
		while(input!=0){
			input = scan.nextInt();
			if (input < 0)
				min++;
			else
				pos++;
		}
		
		System.out.print("Positive Numbers: "+(pos-1)+"\nNegative Numbers: "+min);
	}
}