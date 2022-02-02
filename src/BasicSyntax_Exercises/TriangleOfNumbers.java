package BasicSyntax_Exercises;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int row = 1; row <= size; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
