package Methods_Exercises;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printMatrix(n);
    }

    private static void printLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            printLine(n);
        }
    }
}
