package Methods_Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        if (!hasEnoughCharacters(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!hasOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (hasEnoughCharacters(password) && hasOnlyLettersAndDigits(password) && hasTwoDigits(password)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean hasEnoughCharacters(String s) {
        return s.length() >= 6 && s.length() <= 10;
    }

    private static boolean hasOnlyLettersAndDigits(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLowerCase(c)) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasTwoDigits(String s) {
        int digitCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digitCounter++;
                if (digitCounter == 2) {
                    break;
                }
            }
        }
        return digitCounter == 2;
    }

}