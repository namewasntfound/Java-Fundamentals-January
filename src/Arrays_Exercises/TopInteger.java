package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] <= nums[j]) {
                    break;
                } else if (j == nums.length - 1) {
                    System.out.print(nums[i] + " ");
                }
            }
        }
        System.out.print(nums[nums.length - 1]);
    }
}