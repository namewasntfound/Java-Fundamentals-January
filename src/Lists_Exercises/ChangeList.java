package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            String mainCommand = tokens[0];
            if (mainCommand.equals("Delete")) {
                int element = Integer.parseInt(tokens[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == element) {
                        numbers.remove(i);
                        i--;
                    }
                }
            } else {
                int element = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);
                numbers.add(position, element);
            }
            command = sc.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
