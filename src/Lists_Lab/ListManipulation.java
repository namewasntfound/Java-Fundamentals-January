package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(sc.nextLine().split("\\s"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String mainCommand = input.split("\\s")[0];
            switch (mainCommand) {
                case "Add": {
                    int number = Integer.parseInt(input.split("\\s")[1]);
                    numbers.add(number);
                    break;
                }
                case "Remove": {
                    Integer number = Integer.parseInt(input.split("\\s")[1]);
                    numbers.remove(number);
                    break;
                }
                case "RemoveAt": {
                    int index = Integer.parseInt(input.split("\\s")[1]);
                    numbers.remove(index);
                    break;
                }
                case "Insert": {
                    int number = Integer.parseInt(input.split("\\s")[1]);
                    int index = Integer.parseInt(input.split("\\s")[2]);
                    numbers.add(index, number);
                    break;
                }
            }
            input = sc.nextLine();
        }
        printList(numbers, " ");
    }

    private static void printList(List<Integer> elements, String delimiter) {
        for (Integer element : elements) {
            System.out.print(element + delimiter);
        }
        System.out.println();
    }

}
