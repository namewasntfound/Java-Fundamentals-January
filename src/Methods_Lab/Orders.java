package Methods_Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        totalPrice(product, quantity);
    }

    static void totalPrice(String product, int q) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = q * 1.50;
                break;
            case "water":
                price = q * 1.00;
                break;
            case "coke":
                price = q * 1.40;
                break;
            case "snacks":
                price = q * 2.00;
                break;
        }
        System.out.printf("%.2f", price);
    }
}
