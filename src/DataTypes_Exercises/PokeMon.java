package DataTypes_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());

        int targets = 0;
        int remainderOfN = n;

        while (remainderOfN >= m) {
            remainderOfN -= m;
            targets++;
            double percentage = (remainderOfN * 1.0 / n) * 100.0;
            if (percentage == 50.0) {
                if (y > 0) {
                    remainderOfN /= y;
                }
            }

        }
        System.out.println(remainderOfN);
        System.out.println(targets);

    }
}
