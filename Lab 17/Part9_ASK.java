import java.util.Scanner;
/*
 * @author - Aadhithya Kannan
 * @date - 3 November 2016
 * @period - Period 05
 */
public class Part9_ASK
{
    public static void main(String[] args)
    {
       craps();
    }
    
    public static  void craps(){
        
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
		restart();
	}
	
	public static void lose(){
		System.out.println(" and crapped out!");
		restart();
	}
    
    public static void restart(){
       Scanner scan = new Scanner(System.in);
       System.out.print("Do you want to play again? (y/n) : ");
       if (scan.nextLine().toLowerCase().equals("y")){
           craps();
       }else{
           System.out.println("Thank you for playing.");
       }
    }
}