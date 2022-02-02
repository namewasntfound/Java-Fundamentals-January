package Arrays_Exercises;

import java.util.*;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sumToSearch = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sumToSearch) {
                    System.out.println(nums[i]+ " " + nums[j]);
                }
            }
        }
        System.out.println();


    }
}
