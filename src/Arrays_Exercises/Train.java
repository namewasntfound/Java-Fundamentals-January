package Arrays_Exercises;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] people = new int[n];

        int sum = 0;

        for (int i = 0; i < people.length; i++) {
            people[i] = Integer.parseInt(sc.nextLine());
            sum += people[i];
        }

        for (int person : people) {
            System.out.print(person + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
