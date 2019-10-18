import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate_Triangle_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.#########");
        double l = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double area = getTriangleArea(l, h);
        System.out.println(format.format(area));
    }

    static double getTriangleArea(double length, double height) {
        return (length * height) / 2;
    }
}
