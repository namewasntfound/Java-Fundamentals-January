package BasicSyntax_Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        if (b > 10) {
            System.out.printf("%d X %d = %d%n", a, b, a * b);
        } else {
            for (int i = b; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", a, i, a * i);
            }
        }
    }
}