import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }

        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + oddSum);

    
    }
}