package DataTypes_Exercises;

import java.util.Scanner;

public class PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startRange = Integer.parseInt(sc.nextLine());
        int lastRange = Integer.parseInt(sc.nextLine());

        for (int i = startRange; i <= lastRange; i++) {
            System.out.print((char) i + " ");
        }
    }
}
