import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.print("Enter 6 integers: ");
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);

    }
}