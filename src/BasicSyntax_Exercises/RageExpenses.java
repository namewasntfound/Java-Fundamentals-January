package BasicSyntax_Exercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int headsetTrashes = 0;
        int mouseTrashes = 0;
        int displayTrashes = 0;
        int keyboardTrashes = 0;

        for (int game = 1; game <= lostGamesCount; game++) {
            boolean keyboard = false;
            if (game % 2 == 0) {
                headsetTrashes++;
            }
            if (game % 3 == 0) {
                mouseTrashes++;
            }
            if (game % 2 == 0 && game % 3 == 0) {
                keyboardTrashes++;
                keyboard = true;
            }
            if (keyboard && keyboardTrashes % 2 == 0 && keyboardTrashes != 0) {
                displayTrashes++;
            }
        }

        double totalPrice = mouseTrashes * mousePrice + headsetTrashes * headsetPrice + displayTrashes * displayPrice + keyboardTrashes * keyboardPrice;
        System.out.printf("Rage expenses: %.2f lv.%n", totalPrice);
    }
}
