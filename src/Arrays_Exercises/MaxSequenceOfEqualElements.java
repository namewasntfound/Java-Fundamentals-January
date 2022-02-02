package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int counter = 1;
        int maxCount = 0;
        int number = 0;

        for (int i = 1; i <= numbers.length - 1; i++) {
            if (numbers[i] == numbers[i - 1]) {
                counter++;
                if (counter > maxCount) {
                    maxCount = counter;
                    number = numbers[i];
                }
            } else {
                counter = 1;
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
