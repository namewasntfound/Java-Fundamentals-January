package Methods_Lab;

import java.util.Scanner;

public class CalculateTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        System.out.println(getRectArea(width, height));
    }

    static int getRectArea(int width, int height) {
        return width * height;
    }
}

