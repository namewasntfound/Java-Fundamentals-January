package ObjectsAndClasses_Exercises.Articles;

public class Articles {
    private String title;
    private String content;
    private String author;

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title + " " + "-" + " " + content + ":" + " " + author;
    }

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
