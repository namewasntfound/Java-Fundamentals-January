package BasicSyntax_Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        minutes += 30;
        while (minutes >= 60)
        {
            minutes -= 60;
            hours++;
        }

        while (hours >= 24)
        {
            hours -= 24;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
