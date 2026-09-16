import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter input:");

        // Get array elements
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Find maximum
        int max = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Largest = " + max);
    }
}