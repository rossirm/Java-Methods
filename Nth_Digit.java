import java.util.Scanner;

public class Nth_Digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        double nDigit = number / Math.pow((n - 1), 10) % 10;
        System.out.println(nDigit);
    }
//https://judge.softuni.bg/Contests/Practice/Index/665#10

    /*static int findNthDigit(int number, int index) {
        int result = 0;
        while (index != 0) {
            if (number == index) {
                number = number % 10;
            } else {
                number = number / 10;
            }
        }
        return number;
    }
    */
}
