package DataTypes_Exercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double people = Double.parseDouble(sc.nextLine());
        double capacity = Double.parseDouble(sc.nextLine());

        int courses = (int) Math.ceil((double) people /capacity);
        System.out.println(courses);
    }
}
