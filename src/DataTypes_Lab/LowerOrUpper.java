package DataTypes_Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.nextLine().charAt(0);
        boolean isLower = Character.isLowerCase(input);

        if (!isLower) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
