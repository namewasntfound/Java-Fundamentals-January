package DataTypes_Lab;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meters = Integer.parseInt(sc.nextLine());

        double kilometers = meters / 1000.0;

        System.out.printf("%.2f", kilometers);
    }
}
