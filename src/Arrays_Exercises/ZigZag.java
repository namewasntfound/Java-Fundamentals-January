package Arrays_Exercises;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];

        for (int i = 0; i < n; i++) {
            String[] numbers = sc.nextLine().split(" ");
            if (i % 2 == 0) {
                arr1[i] = numbers[0];
                arr2[i] = numbers[1];

            } else {
                arr2[i] = numbers[0];
                arr1[i] = numbers[1];
            }
        }
        System.out.println(String.join(" ", arr1));
        System.out.println(String.join(" ", arr2));

    }
}
