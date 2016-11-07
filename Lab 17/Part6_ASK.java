import java.util.Scanner;

/*
 * @author - Aadhithya Kannan
 * @date - 3 November 2016
 * @period - Period 05
 */
public class Part6_ASK
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer for the number of rows/2: ");
        int rows = scan.nextInt();
        if (rows == 1){
            System.out.println("*\n*");
        }else{
            for (int i = 1; i <= rows; i++){
                for (int j = 1; j <= rows-i; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= (i*2); k++){
                    System.out.print("*");
                 }
                 System.out.println();
            }
            for (int i = rows; i >= 1; i--){
                for (int j = 1; j <= rows-i; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= (i*2); k++){
                    System.out.print("*");
                 }
                 System.out.println();
            }
  
        }
    }
}