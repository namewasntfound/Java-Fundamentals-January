package DataTypes_Lab;

import java.util.Scanner;

public class CharToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder concat = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char input = sc.nextLine().charAt(0);
            concat.append(input);
        }

        System.out.println(concat);
    }
}
