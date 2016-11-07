import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 3 November 2016
 * @period - Period 05
 */
public class Part1_ASK
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer side-length for the grid: ");
		int side = scan.nextInt();
		for (int i = 0; i < side; i++){
			for (int j = 0; j < side; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}