package DataTypes_Exercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        String largestKeg = "";
        double largestVolume = Double.MIN_VALUE;

        for (int i = 0; i < lines; i++) {
            String kegModel = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());
            double volume = Math.PI * radius* radius * height;
            if (volume > largestVolume) {
                largestKeg = kegModel;
                largestVolume = volume;
            }
        }
        System.out.println(largestKeg);
    }
}
