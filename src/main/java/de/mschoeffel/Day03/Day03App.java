package de.mschoeffel.Day03;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.List;

public class Day03App {

    public static int day03Part1(List<String> inputLines) {
        int trees = 0;
        int xPos = 0;

        for (int i = 1; i < inputLines.size(); i++) {
            String inputLine = inputLines.get(i);
            xPos += 3;
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

    public static void main(String[] args) {
        String inputPath = "Day03/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 03 Part 1] [Result]: %s\n", day03Part1(inputs));
            System.out.println();
        } catch (IOException e) {
            System.out.println("[Day 03] [Error]: Error reading input.txt: " + e);
        }
    }

}
