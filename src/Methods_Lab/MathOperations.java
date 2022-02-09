package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        String operator = sc.nextLine();
        double b = Double.parseDouble(sc.nextLine());
        System.out.println(new DecimalFormat("#.##").format(calculate(a, operator, b)));
    }

    static double calculate(double a, String operator, double b) {
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        return result;
    }
}
