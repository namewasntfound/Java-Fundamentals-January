package Methods_Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            String instruction = tokens[0];

            switch (instruction) {
                case "exchange":
                    ArrayManipulator.exchangeIndex(arr, Integer.parseInt(tokens[1]));
                    break;
                case "max":
                    if (tokens[1].equals("even")) {
                        ArrayManipulator.maxEvenElement(arr);
                    } else if (tokens[1].equals("odd")) {
                        ArrayManipulator.maxOddElement(arr);
                    }
                    break;
                case "min":
                    if (tokens[1].equals("even")) {
                        ArrayManipulator.minEvenElement(arr);
                    } else if (tokens[1].equals("odd")) {
                        ArrayManipulator.minOddElement(arr);
                    }
                    break;
                case "first":
                    if (tokens[2].equals("even")) {
                        ArrayManipulator.firstEvenElements(arr, Integer.parseInt(tokens[1]));
                    } else if (tokens[2].equals("odd")) {
                        ArrayManipulator.firstOddElements(arr, Integer.parseInt(tokens[1]));
                    }
                    break;
                case "last":
                    if (tokens[2].equals("even")) {
                        ArrayManipulator.lastEvenElements(arr, Integer.parseInt(tokens[1]));
                    } else if (tokens[2].equals("odd")) {
                        ArrayManipulator.lastOddElements(arr, Integer.parseInt(tokens[1]));
                    }
                    break;
            }

            command = sc.nextLine();
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void exchangeIndex(int[] arr, int index) {
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Invalid index");
        } else {

            int[] newArray = new int[arr.length];
            int tempIndex = 0;

            for (int i = index + 1; i < arr.length; i++, tempIndex++) {
                newArray[tempIndex] = arr[i];
            }

            for (int i = 0; i <= index; i++, tempIndex++) {
                newArray[tempIndex] = arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] = newArray[i];
            }

        }
    }

    private static void maxEvenElement(int[] arr) {
        int index = -1;
        int maxEven = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= maxEven) {
                maxEven = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void minEvenElement(int[] arr) {
        int index = -1;
        int minEven = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= minEven) {
                minEven = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void maxOddElement(int[] arr) {
        int index = -1;
        int maxOdd = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] != 0 && arr[i] >= maxOdd) {
                maxOdd = arr[i];
                index = i;
            }

        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void minOddElement(int[] arr) {
        int index = -1;
        int minOdd = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] != 0 && arr[i] <= minOdd) {
                minOdd = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void firstEvenElements(int[] arr, int count) {
        if (count <= arr.length) {
            ArrayList<Integer> elements = new ArrayList<>();
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (counter == count) {
                    break;
                }
                if (arr[i] % 2 == 0) {
                    elements.add(arr[i]);
                    counter++;
                }
            }

            System.out.println(elements);

        } else {
            System.out.println("Invalid count");
        }
    }

    private static void lastEvenElements(int[] arr, int count) {
        if (count <= arr.length) {
            ArrayList<Integer> elements = new ArrayList<>();
            int counter = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (counter == count) {
                    break;
                }
                if (arr[i] % 2 == 0) {
                    elements.add(arr[i]);
                    counter++;
                }
            }

            Collections.reverse(elements);

            System.out.println(elements);
        } else {
            System.out.println("Invalid count");
        }
    }

    private static void firstOddElements(int[] arr, int count) {
        if (count <= arr.length) {
            ArrayList<Integer> elements = new ArrayList<>();
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (counter == count) {
                    break;
                }
                if (arr[i] % 2 != 0) {
                    elements.add(arr[i]);
                    counter++;
                }
            }

            System.out.println(elements);

        } else {
            System.out.println("Invalid count");
        }
    }

    private static void lastOddElements(int[] arr, int count) {
        if (count <= arr.length) {
            ArrayList<Integer> elements = new ArrayList<>();
            int counter = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (counter == count) {
                    break;
                }
                if (arr[i] % 2 != 0) {
                    elements.add(arr[i]);
                    counter++;
                }
            }

            Collections.reverse(elements);

            System.out.println(elements);

        } else {
            System.out.println("Invalid count");
        }
    }
}
