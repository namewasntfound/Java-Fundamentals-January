package Methods_Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        topNumber(a);
    }

    private static void topNumber(int a) {
        for (int i = 1; i <= a; i++) {
            int temp = i;
            int digitSum = 0;
            boolean hasOdd = false;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 != 0) {
                    hasOdd = true;
                }
                digitSum += digit;
                temp /= 10;
            }
            if (digitSum % 8 == 0 && hasOdd) {
                System.out.println(i);
            }
        }
    }
}

