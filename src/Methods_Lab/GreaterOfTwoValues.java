package Methods_Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch (input) {
            case "int":
                int a = Integer.parseInt(sc.nextLine());
                int b = Integer.parseInt(sc.nextLine());
                int result = getMax(a, b);
                System.out.println(result);
                break;
            case "char":
                char sym1 = sc.nextLine().charAt(0);
                char sym2 = sc.nextLine().charAt(0);
                char result1 = getMax(sym1, sym2);
                System.out.println(result1);
                break;
            case "string":
                String str1 = sc.nextLine();
                String str2 = sc.nextLine();
                String result3 = getMax(str1, str2);
                System.out.println(result3);
                break;
        }
    }

    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static char getMax(char a, char b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }
}
