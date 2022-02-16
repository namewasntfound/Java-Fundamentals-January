package Lists_Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String mainCommand = tokens[0];
            switch (mainCommand) {
                case "Add": {
                    int number = Integer.parseInt(tokens[1]);
                    numbers.add(number);
                    break;
                }
                case "Insert": {
                    int number = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index > -1 && index < numbers.size()) {
                        numbers.add(index, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                }
                case "Remove": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index > -1 && index < numbers.size()) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                }
                case "Shift": {
                    int count = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("left")) {
                        Collections.rotate(numbers, count * -1);
                    } else {
                        Collections.rotate(numbers, count);
                    }
                }
            }
            command = sc.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}

