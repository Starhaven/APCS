import java.util.Scanner;
/*
 * @author - Aadhithya Kannan
 * @date - 3 November 2016
 * @period - Period 05
 */
public class Part8_ASK
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a \"n\" value for a n x n grid: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == i)
                  System.out.print(i+1);  
                else
                  System.out.print("*");
            }
            System.out.println();
        }
    }
}