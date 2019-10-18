import java.util.Scanner;

public class Sign_of_Integer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printSign(n);
    }

    static void printSign(int n) {
        if (n > 0) {
            System.out.printf("The number %d is positive.", n);
        } else if (n == 0) {
            System.out.printf("The number %d is zero.", n);
        } else {
            System.out.printf("The number %d is negative.", n);
        }
    }
}
