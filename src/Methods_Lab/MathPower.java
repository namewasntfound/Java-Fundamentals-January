package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        System.out.println(new DecimalFormat("#.####").format(mathPower(a, b)));
    }

    static double mathPower(double a, int b) {
        return Math.pow(a, b);
    }
}
