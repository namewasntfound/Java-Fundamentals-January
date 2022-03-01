package ObjectsAndClasses_Exercises.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commands = sc.nextLine().split(": ");
            switch (commands[0]) {
                case "Edit":
                    article.setContent(commands[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(commands[1]);
                    break;
                case "Rename":
                    article.setTitle(commands[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}
