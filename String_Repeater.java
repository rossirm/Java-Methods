import java.util.Scanner;

public class String_Repeater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        repeatString(str, n);

    }
    static String repeatString (String string, int count) {
        String repeatedString = null;
        for (int i = 0; i < count; i++) {
            repeatedString = string;
            System.out.print(repeatedString);
        }
        return repeatedString;
    }
}
