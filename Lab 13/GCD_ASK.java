

import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 24 October 2016
 * @period - Period 05
 */
public class GCD_ASK
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num1 = scan.nextInt();
		System.out.print("Enter a positive integer: ");
		int num2 = scan.nextInt();
		int max = 0;
		
		int index = 0;
		
		if (num1<=num2) 
			max=num1;
		else 
			max=num2;
		
		int factors[] = new int[max];

		int count = 0;
		while(count<Math.sqrt(max)){
			count++;
			if (max%count==0){
				factors[index]=count;
				index++;
			}
		}
		
		int step = index-1;
		while(step>-1){
			System.out.println(max);
			factors[index] = max/factors[step];
			step--;
			index++;
		}
		
		for(int i=0;i<factors.length;i++)
			System.out.println("Factors["+i+"] : "+ factors[i]);
		
		while(num2%factors[index-1]!=0 || num1%factors[index-1]!=0){
			index--;
		}
		
		System.out.println("The GCD of "+num1+" and "+num2+" is "+factors[index-1]);
	}
}