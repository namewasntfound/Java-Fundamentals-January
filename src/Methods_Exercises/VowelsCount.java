package Methods_Exercises;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(vowelsCount(s));
    }

    private static int vowelsCount(String s) {
        int vowelCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o' ||
            c == 'A' || c == 'E' || c == 'U' || c == 'I' || c == 'O') {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }
}