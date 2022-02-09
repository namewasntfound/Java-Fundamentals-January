package Methods_Exercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);
        charsInRange(a, b);
    }

    private static void charsInRange(char a, char b) {
        int aValue = a;
        int bValue = b;

        if (bValue > aValue) {
            for (char c = (char) (a + 1); c < b; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        } else {
            for (char c = (char) (b + 1); c < a; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
