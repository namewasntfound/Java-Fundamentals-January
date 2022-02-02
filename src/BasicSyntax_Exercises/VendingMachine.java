package BasicSyntax_Exercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalCoins = 0;

        while (true) {
            String input = sc.nextLine();
            if (input.equals("Start")) {
                break;
            }
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                totalCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
        }

        while (true) {
            String input = sc.nextLine();
            if (input.equals("End")) {
                break;
            }
            switch (input) {
                case "Nuts":
                    if (totalCoins >= 2.0) {
                        System.out.println("Purchased Nuts");
                        totalCoins -= 2.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalCoins >= 0.7) {
                        System.out.println("Purchased Water");
                        totalCoins -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalCoins >= 1.5) {
                        System.out.println("Purchased Crisps");
                        totalCoins -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (totalCoins >= 0.8) {
                        System.out.println("Purchased Soda");
                        totalCoins -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalCoins >= 1.0) {
                        System.out.println("Purchased Coke");
                        totalCoins -= 1.0;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f", totalCoins);
    }
}
