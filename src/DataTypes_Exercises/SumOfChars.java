package DataTypes_Exercises;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 0; i < lines; i++) {
            char input = sc.nextLine().charAt(0);
            sum += input;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
