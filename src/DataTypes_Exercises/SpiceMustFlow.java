package DataTypes_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int startingYield = Integer.parseInt(br.readLine());

        int days = 0;
        int extractedAmount = 0;

        while (startingYield >= 100) {
            days++;
            extractedAmount += startingYield - 26;
            startingYield -= 10;
        }

        if (startingYield < 100 && days == 0) {
            System.out.println(days);
            System.out.println(extractedAmount);
        } else {
            extractedAmount -= 26;
            System.out.println(days);
            System.out.println(extractedAmount);
        }
    }
}
