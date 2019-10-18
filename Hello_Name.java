import java.util.Scanner;

public class Hello_Name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        System.out.println("Hello, " + printName(n) + "!");
    }

    static String printName(String name) {
        return name;
    }
}
