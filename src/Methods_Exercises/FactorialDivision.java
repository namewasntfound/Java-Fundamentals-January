package Methods_Exercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        long fac1 = factorialNum(a);
        long fac2 = factorialNum(b);

        System.out.printf("%.2f", 1.0 * fac1 / fac2);
    }

    private static long factorialNum(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}