import java.util.Scanner;

public class PrintArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}