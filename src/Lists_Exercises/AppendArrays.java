package Lists_Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> elements = Arrays
                .stream(sc.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(elements);

        List<String> finalElements = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            String[] ele = elements.get(i).split("\\s+");
            for (int j = 0; j < ele.length; j++) {
                if (!ele[j].equals("")) {
                    finalElements.add(ele[j]);
                }
            }
        }

        System.out.println(String.join(" ", finalElements));
    }
}
