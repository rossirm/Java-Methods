import java.util.Scanner;

public class Draw_a_Filled_Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printHeaderFooter(n);
        for (int i = 0; i <= n - 3; i++) {
            printMiddleRow(n);
        }
        printHeaderFooter(n);
    }

    static void printHeaderFooter(int n) {
        System.out.println(new String(new char[2 * n]).
                replace("\0", "-"));
    }

    static void printMiddleRow(int n) {
        System.out.print("-");
        for (int i = 0; i <= n - 2; i++) {
            System.out.print("\\/");
        }
        System.out.println("-");
    }
}
