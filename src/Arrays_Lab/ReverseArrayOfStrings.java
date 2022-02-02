package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = sc.nextLine().split(" ");

        for (int i = 0; i < strArr.length / 2; i++) {
            String temp;
            temp = strArr[i];
            strArr[i] = strArr[strArr.length - 1 - i];
            strArr[strArr.length - 1 - i] = temp;
        }

        for (String s : strArr) {
            System.out.print(s + " ");
        }

    }
}
