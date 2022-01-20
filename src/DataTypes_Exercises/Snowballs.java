package DataTypes_Exercises;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int snowballs = Integer.parseInt(sc.nextLine());

        long highestSnowballValue = Long.MIN_VALUE;
        int highestSnowballSnow = Integer.MIN_VALUE;
        int highestSnowballTime = Integer.MIN_VALUE;
        int highestSnowballQuality = Integer.MIN_VALUE;


        for (int i = 0; i < snowballs; i++) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());

            double division = snowballSnow * 1.0 / snowballTime;
            long snowballValue = (long) Math.pow(division, snowballQuality);
            if (snowballValue > highestSnowballValue) {
                highestSnowballValue = snowballValue;
                highestSnowballSnow = snowballSnow;
                highestSnowballTime = snowballTime;
                highestSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", highestSnowballSnow, highestSnowballTime, highestSnowballValue, highestSnowballQuality);
    }
}