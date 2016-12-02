/*
 * @author - Aadhithya Kannan
 * @date - 26 October 2016
 * @period - Period 05
 */
public class Craps_ASK
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to craps!");
		int roll1 = rollDice();
		int roll2 = rollDice();
		int sum = roll1 + roll2;
		System.out.print("You rolled a "+sum);
		if (sum==11 || sum==7){
			win();
		}else if (sum==2 || sum==3 || sum==12){
			lose();
		}else{
			int sum2 = rollDice()+rollDice();
			while (sum!=sum2 && sum2!=7){
				System.out.print(", "+sum2);
				sum2 = rollDice() + rollDice();
			}
			System.out.print(", "+sum2);
			if (sum==sum2){
				System.out.println(" and made your point!");
			}else{
				lose();
			}
		}
	}
	
	public static int rollDice(){
		return (int) (Math.random()*7);
	}
	
	public static void win(){
		System.out.println(" and won!");
	}
	
	public static void lose(){
		System.out.println(" and crapped out!");
	}
}