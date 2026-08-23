import java.util.Arrays;
import java.util.Scanner;

public class FindLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("The largest element is: " + max);

       
    }
}