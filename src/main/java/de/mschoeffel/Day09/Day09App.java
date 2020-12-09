package de.mschoeffel.Day09;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.List;

public class Day09App {

    public static int day09Part1(List<String> inputLines) {
        return findInvalidNumber(inputLines);
    }

    private static int findInvalidNumber(List<String> inputLines) {
        for (int i = 25; i < inputLines.size(); i++) {
            int toFind = Integer.parseInt(inputLines.get(i));
            if (isValid(inputLines, i, toFind)) {
                System.out.printf("[Day 09 Part 1 OR 2] Valid Number: %s\n", toFind);
            } else {
                System.out.printf("[Day 09 Part 1 OR 2] Invalid Number found: %s\n", toFind);
                return toFind;
            }
        }
        return 0;
    }

    private static boolean isValid(List<String> inputLines, int index, int toFind) {
        for (int x = index - 25; x < index; x++) {
            int xNum = Integer.parseInt(inputLines.get(x));
            for (int y = index - 25; y < index; y++) {
                if (y != x) {
                    int yNum = Integer.parseInt(inputLines.get(y));
                    if (toFind == yNum + xNum) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static long day09Part2(List<String> inputLines) {
        int invalidNumber = findInvalidNumber(inputLines);
        int minIndex = 0;
        int maxIndex = 0;
        boolean found = false;

        for (int i = 0; i < inputLines.size() && !found; i++) {
            minIndex = i;
            long currentSum = Long.parseLong(inputLines.get(i));
            for (int j = i + 1; j < inputLines.size() && !found; j++) {
                maxIndex = j;
                long number = Long.parseLong(inputLines.get(j));
                System.out.printf("[Day 09 Part 2] Checking numbers from: %s to: %s current sum: %s\n", minIndex, maxIndex, currentSum + number);
                if (number + currentSum == invalidNumber) {
                    System.out.printf("[Day 09 Part 2] Valid List found from min: %s to max: %s sum: %s\n", minIndex, maxIndex, currentSum + number);
                    found = true;
                } else if (number + currentSum > invalidNumber) {
                    break;
                } else {
                    currentSum += number;
                }
            }
        }
        System.out.printf("[Day 09 Part 2] Searching for min value and max value in index range min: %s max:%s\n", minIndex, maxIndex);
        long min = Long.MAX_VALUE;
        long max = 0;
        for (int i = minIndex; i <= maxIndex; i++) {
            int currentNumber = Integer.parseInt(inputLines.get(i));
            if (currentNumber > max) {
                System.out.printf("[Day 09 Part 2] New max value found: old: %s new: %s\n", max, currentNumber);
                max = currentNumber;
            }
            if (currentNumber < min) {
                System.out.printf("[Day 09 Part 2] New min value found: old: %s new: %s\n", min, currentNumber);
                min = currentNumber;
            }
        }
        return min + max;
    }

    public static void main(String[] args) {
        String inputPath = "Day09/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 09 Part 1] [Result]: %s\n", day09Part1(inputs));
            System.out.println();
            System.out.printf("[Day 09 Part 2] [Result]: %s\n", day09Part2(inputs));
        } catch (IOException e) {
            System.out.println("[Day 09] [Error]: Error reading input.txt: " + e);
        }
    }

}
