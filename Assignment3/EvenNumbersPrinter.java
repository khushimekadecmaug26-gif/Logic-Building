class EvenNumbersPrinter {

    public static void printEvenNumbers() {
        int i = 1;

        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printEvenNumbers();
    }
}