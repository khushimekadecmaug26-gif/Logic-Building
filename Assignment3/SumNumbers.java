import java.util.Scanner;

class SumNumbers {

    int sumOfTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        SumNumbers obj = new SumNumbers();
        int sum = obj.sumOfTwoNumbers(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}