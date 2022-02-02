package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int index = 0;
        boolean isEqual = false;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }

            if (leftSum == rightSum) {
                isEqual = true;
                index = i;
                break;
            }
        }

        if (isEqual) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }

    }
}
