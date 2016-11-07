import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 3 November 2016
 * @period - Period 05
 */
public class Part5_ASK
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer for the number of rows: ");
		int rows = scan.nextInt();
		for (int i = rows; i > 0; i--){
			for (int k = 0; k < rows-i; k++){
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}