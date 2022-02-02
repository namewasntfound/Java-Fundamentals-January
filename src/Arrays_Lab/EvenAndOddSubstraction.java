package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }

        int diff = evenSum - oddSum;

        System.out.println(diff);
    }
}
