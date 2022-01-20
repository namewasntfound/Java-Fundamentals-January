package DataTypes_Exercises;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());
        int fourthNumber = Integer.parseInt(sc.nextLine());

        System.out.println((firstNumber + secondNumber) / thirdNumber * fourthNumber);
    }
}
