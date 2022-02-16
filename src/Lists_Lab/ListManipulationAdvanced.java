package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String mainCommand = input.split("\\s")[0];
            switch (mainCommand) {
                case "Contains": {
                    int number = Integer.parseInt(input.split("\\s")[1]);
                    System.out.println(numbers.contains(number) ? "Yes" : "No such number");
                    break;
                }
                case "Print": {
                    String clarification = input.split("\\s")[1];
                    if (clarification.equals("even")) {
                        printEvenNumbers(numbers);
                    } else {
                        printOddNumbers(numbers);
                    }
                    break;
                }
                case "Get": {
                    int sum = numbers.stream().mapToInt(Integer::intValue).sum();
                    System.out.println(sum);
                    break;
                }
                case "Filter": {
                    String condition = input.split("\\s")[1];
                    int number = Integer.parseInt(input.split("\\s")[2]);
                    if (condition.equals("<")) {
                        var output = numbers.stream().filter(num -> num < number).collect(Collectors.toList());
                        System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
                    } else if (condition.equals(">")) {
                        var output = numbers.stream().filter(num -> num > number).collect(Collectors.toList());
                        System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
                    } else if (condition.equals(">=")) {
                        var output = numbers.stream().filter(num -> num >= number).collect(Collectors.toList());
                        System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
                    } else {
                        var output = numbers.stream().filter(num -> num <= number).collect(Collectors.toList());
                        System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
                }
            }
            input = sc.nextLine();
        }

    }


    private static void printEvenNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printOddNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}