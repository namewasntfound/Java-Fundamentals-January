package Lists_MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String text = sc.nextLine();

        List<Character> message = new ArrayList<>();

        int textIndices = text.length(); // Indices of the text

        List<Integer> indices = digitSum(numbers);
        List<Character> characterList = characters(text);

        for (int i = 0; i < indices.size(); i++) {
            int currentIndex = indices.get(i);
            char secretChar = 0;
            if (currentIndex > textIndices) {
                secretChar = characterList.get(currentIndex - textIndices);
                message.add(secretChar);
                characterList.remove(currentIndex - textIndices);
            } else {
                secretChar = characterList.get(currentIndex);
                message.add(secretChar);
                characterList.remove(currentIndex);
            }
        }

        for (Character character : message) {
            System.out.print(character);
        }
        System.out.println();


    }

    static List<Integer> digitSum(List<Integer> nums) { // List to store the summed digits
        List<Integer> digitSum = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int currentNum = nums.get(i); // Gets the number (i) from the list
            int sum = 0;
            while (true) { // Digit calculation
                if (currentNum <= 0) {
                    digitSum.add(sum);
                    break;
                }
                int remainder = currentNum % 10;
                sum += remainder;
                currentNum /= 10;
            }
        }
        return digitSum; //  Return list of digit sums
    }

    static List<Character> characters(String text) { // List of Characters in a text
        List<Character> listOfCharacters = new ArrayList<>(); // Create a new list of each character
        for (int i = 0; i < text.length(); i++) { // Loop through text and add characters in a list
            char currentChar = text.charAt(i);
            listOfCharacters.add(currentChar);
        }
        return listOfCharacters; // Return character list
    }
}