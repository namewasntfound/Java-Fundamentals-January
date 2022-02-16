package Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(num -> num < 0);
        Collections.reverse(numbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
