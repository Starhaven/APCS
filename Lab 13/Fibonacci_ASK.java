
import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 24 October 2016
 * @period - Period 05
 */
public class Fibonacci_ASK
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int input = scan.nextInt()-2;
		System.out.println("The "+(input+2)+"th Fibonacci number is "+fib(input)+" because "+fib(input-2)+" + "+fib(input-1)+" = "+fib(input)+".");
	}
	
	public static int fib(int n){
		if (n<2)
			return 1;
		else{
			return fib(n-1)+fib(n-2);
		}
	}
}