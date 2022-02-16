package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> firstDeck = Arrays
                .stream(sc.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDeck = Arrays
                .stream(sc.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstDeck.size() > 0 && secondDeck.size() > 0) {
            if (firstDeck.get(0) > secondDeck.get(0)) {
                firstDeck.add(firstDeck.get(0));
                firstDeck.add(secondDeck.get(0));
            } else if (firstDeck.get(0) < secondDeck.get(0)) {
                secondDeck.add(secondDeck.get(0));
                secondDeck.add(firstDeck.get(0));
            }
            firstDeck.remove(0);
            secondDeck.remove(0);
        }

        if (firstDeck.isEmpty()) {
            int sum = secondDeck.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            int sum = firstDeck.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
