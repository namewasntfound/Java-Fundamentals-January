package ObjectsAndClasses_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger result = new BigInteger(String.valueOf(1));
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}
