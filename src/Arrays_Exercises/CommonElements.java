package Arrays_Exercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i].equals(arr1[j])) {
                    System.out.print(arr1[j] + " ");
                }
            }
        }
    }
}
