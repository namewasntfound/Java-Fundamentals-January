package BasicSyntax_Exercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orders = Integer.parseInt(sc.nextLine());

        double totalPrice = 0;

        for (int i = 0; i < orders; i++) {
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsules = Integer.parseInt(sc.nextLine());

            double orderPrice = pricePerCapsule * days * capsules;
            totalPrice += orderPrice;

            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }
        System.out.printf("Total: $%.2f%n", totalPrice);

    }
}
