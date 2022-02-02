package BasicSyntax_Exercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int tempNum = number;
        int sum = 0;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            tempNum /= 10;
        }
        if (number == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
