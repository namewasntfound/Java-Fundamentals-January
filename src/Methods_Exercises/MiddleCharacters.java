package Methods_Exercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getMiddleCharacter(s);
    }

    private static void getMiddleCharacter(String s) {
        int mid = s.length() / 2;
        if (s.length() % 2 != 0) {
            char c = s.charAt(mid);
            System.out.printf("%c", c);
        } else {
            int mid2 = s.length() / 2 - 1;
            char c1 = s.charAt(mid2);
            char c2 = s.charAt(mid);
            System.out.printf("%c%c", c1,c2);
        }
    }

}
