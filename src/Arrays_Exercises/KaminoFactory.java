package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lengthOfSequence = Integer.parseInt(sc.nextLine());

        int[] bestDnaSample = new int[lengthOfSequence];

        int leftMostStartingIndex = -1; // -1 means there is not a subsequence of ones
        int maxOnesSubsequenceCounter = 1;
        int sumOfBestSample = 0;
        int bestSampleNumber = 0;
        int sampleCounter = 0;

        String input = sc.nextLine();

        while (!input.equals("Clone them!")) {

            int[] dnaSample = Arrays
                    .stream(input.split("!+"))
                    .mapToInt(Integer::parseInt).toArray();

            sampleCounter++;

            int onesSubsequenceCounter = 1;
            int bestOnesSubsequenceCounter = 1;
            int currentLeftStartingIndex = -1;
            int currentSumOfElements = 0;

            for (int i = 0; i < dnaSample.length - 1; i++) {
                if (dnaSample[i] == dnaSample[i + 1]) {
                    onesSubsequenceCounter++;
                } else {
                    onesSubsequenceCounter = 1;
                }
                if (onesSubsequenceCounter > bestOnesSubsequenceCounter) {
                    currentLeftStartingIndex = i;
                    bestOnesSubsequenceCounter = onesSubsequenceCounter;
                }
                currentSumOfElements += dnaSample[i];
            }
            currentSumOfElements += dnaSample[dnaSample.length - 1];

            if (bestOnesSubsequenceCounter > maxOnesSubsequenceCounter) {
                maxOnesSubsequenceCounter = bestOnesSubsequenceCounter;
                bestDnaSample = Arrays.stream(dnaSample).toArray();
                leftMostStartingIndex = currentLeftStartingIndex;
                bestSampleNumber = sampleCounter;
                sumOfBestSample = currentSumOfElements;

            } else if (bestOnesSubsequenceCounter == maxOnesSubsequenceCounter) {
                if (currentLeftStartingIndex < leftMostStartingIndex) {
                    bestDnaSample = Arrays.stream(dnaSample).toArray();
                    leftMostStartingIndex = currentLeftStartingIndex;
                    bestSampleNumber = sampleCounter;
                    sumOfBestSample = currentSumOfElements;
                } else if (currentSumOfElements > sumOfBestSample) {
                    bestDnaSample = Arrays.stream(dnaSample).toArray();
                    leftMostStartingIndex = currentLeftStartingIndex;
                    bestSampleNumber = sampleCounter;
                    sumOfBestSample = currentSumOfElements;
                }
            }

            input = sc.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSampleNumber, sumOfBestSample);
        for (int i : bestDnaSample) {
            System.out.print(i + " ");
        }
    }
}