package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(sc.nextLine());


        String input = sc.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("Add")) {
                int numberToAdd = Integer.parseInt(tokens[1]);
                numbers.add(numberToAdd);
            } else {
                int numberToAdd = Integer.parseInt(tokens[0]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (numberToAdd + numbers.get(i) <= maxCapacity) {
                        numbers.set(i, numberToAdd + numbers.get(i));
                        break;
                    }
                }
            }
            input = sc.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number+ " ");
        }

    }
}
