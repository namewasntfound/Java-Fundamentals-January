package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(Math.abs(number)));

    }

    private static int getMultipleOfEvensAndOdds(int n) {
        int evensSum = getSumOfEvenDigits(n);
        int oddsSum = getSumOfOddDigits(n);

        return evensSum * oddsSum;
    }

    private static int getSumOfOddDigits(int n) {
        int oddsSum = 0;
        while (n > 0) {
            int digit = 0;
            digit = n % 10;
            if (digit % 2 == 1) {
                oddsSum += digit;
            }
            n /= 10;
        }
        return oddsSum;
    }

    private static int getSumOfEvenDigits(int n) {
        int evensSum = 0;
        while (n > 0) {
            int digit = 0;
            digit = n % 10;
            if (digit % 2 == 0) {
                evensSum += digit;
            }
            n /= 10;
        }
        return evensSum;
    }
}
