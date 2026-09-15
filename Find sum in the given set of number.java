
import java.util.Scanner;
class Main 
{
    public static void main(String[] args)
     {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =n ; n != 0 ; i++)
            {
                int digit = n % 10;
                n = n / 10;
                sum = sum + digit;
                System.out.println(sum);
            }

            }
}