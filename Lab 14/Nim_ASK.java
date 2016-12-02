import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 26 October 2016
 * @period - Period 05
 */
public class Nim_ASK
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int total = (int) (Math.random()*6+10);
		int userCh;
		int compCh;
		boolean turn = false;
		
		System.out.println("You are playing the ancient game of Nim.");
		
		while (total > 0){
			turn = !turn;
			System.out.println("There are "+total+" coins in the pot.");
			System.out.println("How many coins will you remove? (1 – 3): ");
			userCh = scan.nextInt();
			while (userCh > total){
				System.out.print("There are only "+total+" coins left. You can't remove "+userCh+" coins. Please choose again.");
				userCh = scan.nextInt();
			}
			while (userCh > 3 || userCh < 1){
				System.out.print("You can only remove 1-3 coins. Please choose again: ");
				userCh = scan.nextInt();
			}
			total -= userCh;
			if (total > 0){
				turn = !turn;
				if (total>3)
					compCh = (int) (Math.random()*3+1);
				else{
					compCh = (int) (Math.random()*total+1);
				}
				System.out.println("The computer removes "+compCh+" coins.");
				total -= compCh;
			}
		}
		
		if (turn)
			System.out.println("You lose");
		else
			System.out.println("You win");
		
	}
}