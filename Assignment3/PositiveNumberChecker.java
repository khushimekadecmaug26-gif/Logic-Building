import java.util.Scanner;

class PositiveNumberChecker {

    public static void askForPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0); 

        System.out.println("You entered a positive number: " + number);

    }

    public static void main(String[] args) {
        askForPositiveNumber();
    }
}