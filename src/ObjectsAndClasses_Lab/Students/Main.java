package ObjectsAndClasses_Lab.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String input = sc.nextLine();

        List<Student> studentsList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setHometown(hometown);

            studentsList.add(student);

            input = sc.nextLine();
        }

        String cityName = sc.nextLine();
        List<Student> filteredList = studentsList.stream().filter(s -> s.getHometown().equals(cityName))
                .collect(Collectors.toList());

        for (Student student : filteredList) {
            System.out.println(student);
        }

    }
}
