/*
*@author - Aadhithya Kannan
*@date - 29 October 2016
*@period - Period 05
*/
public class Pokemon_ASK
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 100; i++){
			if (i%3==0 && i%5==0){
				System.out.println("Pokemon");
			}else if (i%3==0){
				System.out.println("Poke");
			}else if (i%5==0){
				System.out.println("mon");
			}else{
				System.out.println(i);
			}
		}
	}
}