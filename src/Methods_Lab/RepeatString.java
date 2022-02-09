package Methods_Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        System.out.println(repeatStr(str, count));
    }

    static String repeatStr(String str, int count) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < count; i++) {
            text.append(str);
        }
        return text.toString();
    }
}
