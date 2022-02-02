package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fieldSize = Integer.parseInt(sc.nextLine());
        int[] ladybugField = new int[fieldSize];
        int[] initialPositions = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < initialPositions.length; i++) {
            int index = initialPositions[i];
            if (index >= 0 && index < ladybugField.length) {
                ladybugField[index] = 1;
            }
        }

        String command = sc.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if (index >= 0 && index < ladybugField.length && ladybugField[index] == 1) {
                ladybugField[index] = 0;

                if (direction.equals("right")) {
                    index += flyLength;
                    while (index < ladybugField.length && ladybugField[index] == 1) {
                        index += flyLength;
                    }
                    if (index < ladybugField.length) {
                        ladybugField[index] = 1;
                    }
                } else {
                    index -= flyLength;
                    while (index >= 0 && ladybugField[index] == 1) {
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        ladybugField[index] = 1;
                    }
                }
            }

            command = sc.nextLine();
        }

        for (int i : ladybugField) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}