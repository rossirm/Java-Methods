import java.text.DecimalFormat;
import java.util.Scanner;

public class Math_Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.#########");
        int m = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(format.format(calculatePower(m, n)));
    }

    private static double calculatePower(double number, double power) {
        return Math.pow(number, power);
    }
}
