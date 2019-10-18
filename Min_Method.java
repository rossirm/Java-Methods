import java.util.Scanner;

public class Min_Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        System.out.println(getMin(getMin(a, b), c));

    }
    static int getMin (int a, int b) {
        return Math.min(a, b);
    }
}
