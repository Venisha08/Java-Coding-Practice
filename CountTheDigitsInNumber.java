import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = n; i != 0; i = i / 10) {
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}