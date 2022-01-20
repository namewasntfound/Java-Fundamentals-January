package DataTypes_Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNumber = 0;
        boolean isSpecialNumber = false;

        for (int startingNumber = 1; startingNumber <= number; startingNumber++) {
            currentNumber = startingNumber;
            while (startingNumber > 0) {
                sum += startingNumber % 10;
                startingNumber = startingNumber / 10;
            }
            isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", currentNumber, isSpecialNumber);
            sum = 0;
            startingNumber = currentNumber;
        }

    }
}
