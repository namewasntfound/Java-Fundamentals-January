package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(sc.nextLine());

        leftRotate(arr, rotations);
        printArray(arr);
    }

    static void leftRotate(int[] arr, int rotations) {

        int length = arr.length;

        rotations = rotations % length;
        reverseArray(arr, 0, rotations - 1);
        reverseArray(arr, rotations, length - 1);
        reverseArray(arr, 0, length - 1);
    }

    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
