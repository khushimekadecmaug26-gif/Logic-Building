public class OddNumberStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int oddVal = 2 * j - 1;
                System.out.print(oddVal);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}