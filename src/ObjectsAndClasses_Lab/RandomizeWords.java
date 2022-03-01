package ObjectsAndClasses_Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        String[] text = sc.nextLine().split(" ");

        for (int i = 0; i < text.length; i++) {
            int newPosition = rnd.nextInt(text.length);
            String temp = text[i];
            text[i] = text[newPosition];
            text[newPosition] = temp;
        }

        for (String s : text) {
            System.out.println(s);
        }

    }
}
