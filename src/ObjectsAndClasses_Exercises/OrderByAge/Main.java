package ObjectsAndClasses_Exercises.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Person> students = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name, id, age);
            students.add(person);

            input = sc.nextLine();
        }

        students.sort(Comparator.comparing(Person::getAge));

        for (Person student : students) {
            System.out.println(student);
        }

    }
}
