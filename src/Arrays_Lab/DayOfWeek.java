package Arrays_Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day = Integer.parseInt(sc.nextLine());
        if (day <= 0 || day > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(daysOfWeek[day - 1]);
        }
    }
}
