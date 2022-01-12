package BasicSyntax_Lab;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
            counter++;
            sum += i;
            if (counter == n) {
                break;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
