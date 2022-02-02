package BasicSyntax_Exercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(user);
        String reversed = String.valueOf(sb.reverse());

        int inputCounter = 0;

        while (true) {
            String attempt = sc.nextLine();
            inputCounter++;
            if (attempt.equals(reversed)) {
                System.out.printf("User %s logged in.%n", user);
                break;
            } else if (inputCounter == 4) {
                System.out.printf("User %s blocked!", user);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
