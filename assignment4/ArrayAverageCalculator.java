import java.util.Scanner;

public class ArrayAverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter 5 integers: ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("The average of the numbers is: " + average);

    }
}