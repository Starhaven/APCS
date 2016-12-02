import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 24 October 2016
 * @period - Period 05
 */
public class PerfectNumber_ASK
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int number = scan.nextInt();
		int count = 0;
		int sum = 0;
		while(count<Math.sqrt(number)){
			count++;
			if (number%count==0){
				sum+=count;
				sum+=number/count;
			}
		}
		sum-=number;
		if (sum==number)
			System.out.println(number+" is a perfect number.");
		else
			System.out.println(number+" is not a perfect number.");
	}

}