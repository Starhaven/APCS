import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 3 November 2016
 * @period - Period 05
 */

public class Part4_ASK
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer for the number of rows: ");
		int rows = scan.nextInt();
		for (int i = rows; i > 0; i--){
			for (int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}