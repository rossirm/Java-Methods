import java.util.Scanner;

public class Printing_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            printLine(1, i);
        }
        printLine(1, n);

        for (int i = n - 1; i > 0; i--) {
            printLine(1, i);
        }
    }

    static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
