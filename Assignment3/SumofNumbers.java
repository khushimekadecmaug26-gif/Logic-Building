import java.util.Scanner;

class SumOfNumbers {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add current value of i to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int totalSum = calculateSum(n);
        System.out.println("The sum of numbers from 1 to " + n + " is: " + totalSum);

    }
}