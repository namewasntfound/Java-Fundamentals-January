package Lists_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = Arrays
                .stream(sc.nextLine().split("\\s"))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(printList(numbers, " "));
    }

    private static String printList(List<Double> elements, String delimiter) {
        String output = "";
        for (Double element : elements) {
            output += new DecimalFormat("0.#").format(element) + delimiter;
        }
        return output;
    }
}
