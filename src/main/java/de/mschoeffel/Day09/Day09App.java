package de.mschoeffel.Day09;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.List;

public class Day09App {

    public static int day09Part1(List<String> inputLines) {
        for (int i = 25; i < inputLines.size(); i++) {
            int toFind = Integer.parseInt(inputLines.get(i));
            if (isValid(inputLines, i, toFind)) {
                System.out.printf("[Day 09 Part 1] Valid Number: %s\n", toFind);
            } else {
                System.out.printf("[Day 09 Part 1] Invalid Number found: %s\n", toFind);
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

    public static void main(String[] args) {
        String inputPath = "Day09/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 09 Part 1] [Result]: %s\n", day09Part1(inputs));
            System.out.println();
        } catch (IOException e) {
            System.out.println("[Day 09] [Error]: Error reading input.txt: " + e);
        }
    }

}
