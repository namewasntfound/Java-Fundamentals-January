package BasicSyntax_Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        String groupType = sc.nextLine();
        String day = sc.nextLine();

        double totalPrice = 0.0;

        switch (groupType) {
            case "Students":
                if ("Friday".equals(day)) {
                    totalPrice = people * 8.45;
                } else if ("Saturday".equals(day)) {
                    totalPrice = people * 9.80;
                } else if ("Sunday".equals(day)) {
                    totalPrice = people * 10.46;
                }
                if (people >= 30) {
                    totalPrice *= 0.85;
                }
                break;

            case "Business":
                if ("Friday".equals(day)) {
                    totalPrice = people * 10.90;
                } else if ("Saturday".equals(day)) {
                    totalPrice = people * 15.60;
                } else if ("Sunday".equals(day)) {
                    totalPrice = people * 16.00;
                }
                if (people >= 100 && "Friday".equals(day)) {
                    totalPrice -= 10 * 10.90;
                } else if (people >= 100 && "Saturday".equals(day)) {
                    totalPrice -= 10 * 15.60;
                } else if (people >= 100 && "Sunday".equals(day)) {
                    totalPrice -= 10 * 16.00;
                }
                break;
            case "Regular":
                if ("Friday".equals(day)) {
                    totalPrice = people * 15.00;
                } else if ("Saturday".equals(day)) {
                    totalPrice = people * 20.00;
                } else if ("Sunday".equals(day)) {
                    totalPrice = people * 22.50;
                }
                if (people >= 10 && people <= 20) {
                    totalPrice *= 0.95;
                }
                break;

        }

        System.out.printf("Total price: %.2f%n", totalPrice);

    }
}