package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays
                .stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());

        int[] bombNumbers = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String specialBombNumber = String.valueOf(bombNumbers[0]);
        int bombPower = bombNumbers[1];

        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index).equals(specialBombNumber)) {
                if (index + bombPower < numbers.size() && index - bombPower >= 0) {
                    for (int i = index - bombPower; i <= index + bombPower; i++) {
                        numbers.set(i, "d");
                    }
                } else if (index + bombPower > numbers.size()) {
                    for (int i = index - bombPower; i < numbers.size(); i++) {
                        numbers.set(i, "d");
                    }
                } else {
                    for (int i = 0; i <= index + bombPower; i++) {
                        numbers.set(i, "d");
                    }
                }
            }
        }
        numbers.removeIf(e -> e.equals("d"));

        int sum = 0;

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            sum += num;
        }

        System.out.println(sum);
    }
}
