package Methods_Exercises;

import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.equals("END")) {
            System.out.println(isPalindromeInteger(s));
            s = sc.nextLine();
        }
    }

    private static boolean isPalindromeInteger(String s) {
        StringBuilder rvs = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            rvs.append(c);
        }
        return rvs.toString().equals(s);
    }
}
