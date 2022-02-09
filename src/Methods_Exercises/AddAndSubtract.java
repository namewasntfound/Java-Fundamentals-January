package Methods_Exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        System.out.println(addAndSubtract(a,b,c));

    }

    private static int addAndSubtract(int a, int b, int c) {
        int sum = (a + b) - c;
        return sum;
    }
}
