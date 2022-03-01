package ObjectsAndClasses_Exercises.ArticlesUpdated;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] input = sc.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article article = new Article(title, content, author);

            articles.add(article);
        }

        String command = sc.nextLine();

        switch (command) {
            case "title":
                articles.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articles.sort(Comparator.comparing(Article::getAuthor));
                break;
        }

        for (Article article : articles) {
            System.out.println(article);
        }

    }
}
