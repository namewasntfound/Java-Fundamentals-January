package ObjectsAndClasses_Exercises.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] tokens = sc.nextLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
