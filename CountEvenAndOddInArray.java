import java.util.Scanner;

class CountEvenAndOddInArray{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println("Enter a element:");
    
    int a[] = new int[n];

    for(int i =0 ;i<a.length;i++)
    {
        a[i] = sc.nextInt();
    }

    int evencount = 0;
    int oddcount = 0;

    for(int i =0; i < a.length;i++)
    {
        if(a[i] % 2 == 0)
        {
            evencount++;
        }
        else
        {
            oddcount++;
        }
        
        }
    }
}
