package de.mschoeffel.Day03;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.List;

public class Day03App {

    public static int day03Part1(List<String> inputLines) {
        int trees = countTrees(1, 3, inputLines);
        System.out.printf("[Day 03 Part 1] Trees found 1 Down 3 Right: %s\n", trees);
        return trees;
    }

    private static int countTrees(int down, int right, List<String> inputLines) {
        int trees = 0;
        int xPos = 0;

        for (int i = down; i < inputLines.size(); i += down) {
            String inputLine = inputLines.get(i);
            xPos += right;
            if (xPos >= inputLine.length()) {
                xPos -= inputLine.length();
            }
            char c = inputLine.charAt(xPos);
            if (c == '#') {
                trees++;
            }
        }
        return trees;
    }

    public static long day03Part2(List<String> inputLines) {
        int trees1Down1Right = countTrees(1, 1, inputLines);
        System.out.printf("[Day 03 Part 2] Trees found 1 Down 1 Right: %s\n", trees1Down1Right);

        int trees1Down3Right = countTrees(1, 3, inputLines);
        System.out.printf("[Day 03 Part 2] Trees found 1 Down 3 Right: %s\n", trees1Down3Right);

        int trees1Down5Right = countTrees(1, 5, inputLines);
        System.out.printf("[Day 03 Part 2] Trees found 1 Down 5 Right: %s\n", trees1Down5Right);

        int trees1Down7Right = countTrees(1, 7, inputLines);
        System.out.printf("[Day 03 Part 2] Trees found 1 Down 7 Right: %s\n", trees1Down7Right);

        int trees2Down1Right = countTrees(2, 1, inputLines);
        System.out.printf("[Day 03 Part 2] Trees found 2 Down 1 Right: %s\n", trees2Down1Right);

        return (long) trees1Down1Right * (long) trees1Down3Right * (long) trees1Down5Right * (long) trees1Down7Right * (long) trees2Down1Right;
    }

    public static void main(String[] args) {
        String inputPath = "Day03/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 03 Part 1] [Result]: %s\n", day03Part1(inputs));
            System.out.println();
            System.out.printf("[Day 03 Part 2] [Result]: %s\n", day03Part2(inputs));
        } catch (IOException e) {
            System.out.println("[Day 03] [Error]: Error reading input.txt: " + e);
        }
    }

}
