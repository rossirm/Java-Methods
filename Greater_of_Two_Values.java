import java.util.Scanner;

public class Greater_of_Two_Values {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        if (type.equals("int")) {
            int first = Integer.parseInt(scan.nextLine());
            int second = Integer.parseInt(scan.nextLine());
            int max = getMax(first, second);
            System.out.println(max);
        } else if (type.equals("char")) {
            char first = scan.next().charAt(0);
            char second = scan.next().charAt(0);
            char max = getMax(first, second);
            System.out.println(max);
        } else if (type.equals("string")) {
            String first = scan.nextLine().toLowerCase();
            String second = scan.nextLine().toLowerCase();
            String max = getMax(first, second);
            System.out.println(max);
        }
    }

    static int getMax(int first, int second) {
        int result = 0;
        if (first >= second) {
            result = first;
        } else {
            result = second;
        }
        return result;
    }

    static char getMax(char first, char second) {
        char result = 0;
        if (first >= second) {
            result = first;
        } else {
            result = second;
        }
        return result;
    }

    static String getMax(String first, String second) {
        String result = null;
        if (first.compareTo(second) > 0) {
            result = first;
        } else if (first.compareTo(second) == 0) {
            result = "0";
        } else if (first.compareTo(second) < 0) {
            result = second;
        }
        return result;
    }
}
