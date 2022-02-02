package Arrays_Lab;

import java.util.Scanner;

public class PrintInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[length];

        for (int i = numbers.length - 1; i >= 0; i--) {
            int num = Integer.parseInt(sc.nextLine());
            numbers[i] = num;
        }

        for (int number : numbers) {
            System.out.print(number+ " ");
        }

    }
}
