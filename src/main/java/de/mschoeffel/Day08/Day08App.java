package de.mschoeffel.Day08;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day08App {

    public static int day08Part1(List<String> inputLines) {
        int acc = 0;
        Set<Integer> visitedLines = new HashSet<>();

        for (int i = 0; i < inputLines.size(); i++) {
            String[] inputLineSplit = inputLines.get(i).split(" ");
            String operation = inputLineSplit[0];
            int argument = Integer.parseInt(inputLineSplit[1]);

            if (visitedLines.contains(i)) {
                return acc;
            }
            visitedLines.add(i);

            switch (operation) {
                case "acc":
                    acc += argument;
                    break;
                case "jmp":
                    i += argument - 1;
                    break;
                case "nop":
                    break;
            }
        }

        return acc;
    }

    public static void main(String[] args) {
        String inputPath = "Day08/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 08 Part 1] [Result]: %s\n", day08Part1(inputs));
            System.out.println();
        } catch (IOException e) {
            System.out.println("[Day 08] [Error]: Error reading input.txt: " + e);
        }
    }

}
