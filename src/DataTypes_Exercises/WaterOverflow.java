package DataTypes_Exercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        int waterInTank = 0;

        for (int i = 0; i < lines; i++) {
            int waterQuantity = Integer.parseInt(sc.nextLine());
            if (waterInTank + waterQuantity > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                waterInTank += waterQuantity;
            }
        }
        System.out.println(waterInTank);
    }
}
