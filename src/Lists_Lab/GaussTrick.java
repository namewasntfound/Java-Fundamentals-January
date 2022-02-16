package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int size = numbers.size();

        for (int i = 0; i < size / 2; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.set(i, sum);
            numbers.remove(numbers.get(numbers.size() - 1));
        }

        printList(numbers, " ");
    }

    private static void printList(List<Integer> numbers, String delimiter) {
        for (Integer number : numbers) {
            System.out.print(number + delimiter);
        }
        System.out.println();
    }
}
