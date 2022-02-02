package BasicSyntax_Exercises;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
