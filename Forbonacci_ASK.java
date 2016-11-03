import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 28 October 2016
 * @period - Period 05
 */
public class Forbonacci_ASK
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int digit = scan.nextInt();
		int x=0;
		int y=1;
		int bef1=0;
		int bef2=0;
		for (int i = 0; i < digit-1; i++){
			bef1 = x;
			bef2 = y;
			y += x;
			x = bef2;
		}
		switch (digit){
			case 0:
				System.out.println("The 1st Fibonnaci number is 0 because 0 + 0 = 1.");
				break;
			case 1:
				System.out.println("The 2nd Fibonnaci number is 1 because 0 + 1 = 1.");
				break;
		}
		if (digit != 1 && digit != 0)
		System.out.println("The "+digit+"th Fibonnaci number is "+y+" because "+bef1+" + "+bef2+" = "+y+".");
	}
}