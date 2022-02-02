package BasicSyntax_Exercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double priceOfLightsabers = Double.parseDouble(sc.nextLine());
        double priceOfRobes = Double.parseDouble(sc.nextLine());
        double priceOfBelts = Double.parseDouble(sc.nextLine());

        double totalPrice = priceOfLightsabers * (Math.ceil(students * 1.10)) + priceOfRobes * students
                + priceOfBelts * (students - Math.floor(students / 6));

        if (amountOfMoney >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.%n", totalPrice - amountOfMoney);
        }

    }
}
