package ObjectsAndClasses_Lab.StudentsUpdated;

import ObjectsAndClasses_Lab.Students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String input = sc.nextLine();

        List<Students> studentsList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            Students student = studentsList
                    .stream()
                    .filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName))
                    .findFirst()
                    .orElse(null);

            if (student == null) {
                Students studentToAdd = new Students();
                studentToAdd.setFirstName(firstName);
                studentToAdd.setLastName(lastName);
                studentToAdd.setAge(age);
                studentToAdd.setHometown(hometown);
                studentsList.add(studentToAdd);
            } else {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(hometown);
            }


            input = sc.nextLine();
        }

        String cityName = sc.nextLine();
        List<Students> filteredList = studentsList.stream().filter(s -> s.getHometown().equals(cityName))
                .collect(Collectors.toList());

        for (Students student : filteredList) {
            System.out.println(student);
        }

    }
}
