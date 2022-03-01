package ObjectsAndClasses_Exercises.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] person = sc.nextLine().split("\\s+");
            String name = person[0];
            int age = Integer.parseInt(person[1]);
            if (age > 30) {
                people.add(new Person(name, age));
            }

        }

        people.sort(Comparator.comparing(Person::getName));

        for (Person person : people) {
            System.out.println(person.getName() + " " + "-" + " " + person.getAge());
        }
    }
}
