package Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> firstList = Arrays
                .stream(sc.nextLine().split("\\s")).collect(Collectors.toList());
        List<String> secondList = Arrays
                .stream(sc.nextLine().split("\\s")).collect(Collectors.toList());

        printList(mergeLists(firstList, secondList));
    }

    private static List<String> mergeLists(List<String> firstList, List<String> secondList) {
        List<String> mergedList = new ArrayList<>();
        int firstLength = firstList.size();
        int secondLength = secondList.size();

        if (firstLength == secondLength) {
            for (int i = 0; i < firstLength; i++) {
                mergedList.add(firstList.get(i));
                mergedList.add(secondList.get(i));
            }
        } else if (firstLength > secondLength) {
            for (int i = 0; i < secondList.size(); i++) {
                mergedList.add(firstList.get(i));
                mergedList.add(secondList.get(i));
                firstList.remove(i);
                secondList.remove(i);
                i--;
            }
            mergedList.addAll(firstList);
        } else {
            for (int i = 0; i < firstList.size(); i++) {
                mergedList.add(firstList.get(i));
                mergedList.add(secondList.get(i));
                firstList.remove(i);
                secondList.remove(i);
                i--;
            }
            mergedList.addAll(secondList);
        }
        return mergedList;
    }

    private static void printList(List<String> elements) {
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
