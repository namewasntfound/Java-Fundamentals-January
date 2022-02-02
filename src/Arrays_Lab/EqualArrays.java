package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num1 = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] num2 = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isEqual = true;

        for (int i = 0; i < num1.length; i++) {
            sum += num1[i];
            if (num1[i] != num2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
