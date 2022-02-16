package Lists_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String command = sc.nextLine();
            String[] tokens = command.split(" ");
            String name = tokens[0];
            String mainCommand = tokens[2];

            if (!mainCommand.equals("not")) {
                if (!names.contains(name)) {
                    names.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }
            } else {
                if (names.contains(name)) {
                    names.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        for (String name : names) {
            System.out.println(name);
        }

    }
}
