
import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 24 October 2016
 * @period - Period 05
 */
public class Biology_ASK
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How often does the population double (in hours)? ");
		double hours = scan.nextDouble();
		System.out.print("\nWhat is the starting population? ");
		int start = scan.nextInt();
		System.out.print("\nWhat is the ending population? ");
		int end = scan.nextInt();
		
		System.out.print("It will take "+(Math.log((end/start))/Math.log(2)*hours)+" hours for "+start+" organisms to become "+end+" organisms when they double every "+hours+" hours.");
	}
}