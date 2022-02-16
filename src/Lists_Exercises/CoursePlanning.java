package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<String> lessons = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("course start")) {
            String mainCommand = input.split(":")[0];
            String lessonTitle = input.split(":")[1];
            switch (mainCommand) {
                case "Add": {
                    addTitle(lessons, lessonTitle);
                    break;
                }
                case "Insert": {
                    int index = Integer.parseInt(input.split(":")[2]);
                    insertTitle(lessons, lessonTitle, index);
                    break;
                }
                case "Remove": {
                    removeTitle(lessons, lessonTitle);
                    break;
                }
                case "Swap":
                    String secondLessonTitle = input.split(":")[2];
                    swapTitles(lessons, lessonTitle, secondLessonTitle);
                    break;
                case "Exercise":
                    addExercise(lessons, lessonTitle);
                    break;
            }
            input = sc.nextLine();
        }

        printLessons(lessons);

    }

    private static List<String> addTitle(List<String> lessons, String lessonToAdd) {
        if (!lessons.contains(lessonToAdd)) {
            lessons.add(lessonToAdd);
        }
        return lessons;
    }

    private static List<String> insertTitle(List<String> lessons, String lessonTitle, int index) {
        if (!lessons.contains(lessonTitle) && index >= 0 && index < lessons.size()) {
            lessons.add(index, lessonTitle);
        }
        return lessons;
    }

    private static List<String> removeTitle(List<String> lessons, String lessonTitle) {
        String exercise = lessonTitle + "-Exercise";
        lessons.remove(lessonTitle);
        lessons.remove(exercise);
        return lessons;
    }

    private static List<String> swapTitles(List<String> lessons, String firstLessonTitle, String secondLessonTitle) {
        if (lessons.contains(firstLessonTitle) && lessons.contains(secondLessonTitle)) {
            int firstIndex = lessons.indexOf(firstLessonTitle);
            int secondIndex = lessons.indexOf(secondLessonTitle);
            lessons.set(firstIndex, secondLessonTitle);
            lessons.set(secondIndex, firstLessonTitle);

            if (lessons.contains(firstLessonTitle + "-Exercise")) {
                lessons.remove(firstLessonTitle + "-Exercise");
                lessons.add(secondIndex + 1, firstLessonTitle + "-Exercise");
            }

            if (lessons.contains(secondLessonTitle + "-Exercise")) {
                lessons.remove(secondLessonTitle + "-Exercise");
                lessons.add(firstIndex + 1, secondLessonTitle + "-Exercise");
            }
        }
        return lessons;
    }

    private static List<String> addExercise(List<String> lessons, String lessonTitle) {
        if (lessons.contains(lessonTitle) && !lessons.contains(lessonTitle + "-Exercise")) {
            int lessonIndex = lessons.indexOf(lessonTitle);
            lessons.add(lessonIndex + 1, lessonTitle + "-Exercise");
        } else if (!lessons.contains(lessonTitle)) {
            lessons.add(lessonTitle);
            lessons.add(lessonTitle + "-Exercise");
        }
        return lessons;
    }

    private static void printLessons(List<String> lessons) {
        int index = 1;
        for (String lesson : lessons) {
            System.out.printf("%d.%s%n", index, lesson);
            index++;
        }

    }
}
