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
                System.out.printf("[Day 08 Part 2] Program has already executed line: %s\n", i);
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

    public static int day08Part2(List<String> inputLines) {
        Set<Integer> changedLines = new HashSet<>();
        while (true) {
            boolean changePossible = true;
            int acc = 0;
            Set<Integer> visitedLines = new HashSet<>();

            System.out.printf("[Day 08 Part 2] New attempt Changes tried: %s\n", changedLines);

            for (int i = 0; i < inputLines.size(); i++) {
                String[] inputLineSplit = inputLines.get(i).split(" ");
                String operation = inputLineSplit[0];
                int argument = Integer.parseInt(inputLineSplit[1]);

                if (visitedLines.contains(i)) {
                    System.out.printf("[Day 08 Part 2] Program has already executed line: %s\n", i);
                    break;
                }
                visitedLines.add(i);

                if (changePossible && !changedLines.contains(i)) {
                    if (operation.equals("jmp")) {
                        System.out.printf("[Day 08 Part 2] Changing line: %s From: jmp %s to nop %s\n", i, argument, argument);
                        operation = "nop";
                        changedLines.add(i);
                        changePossible = false;
                    } else if (operation.equals("nop")) {
                        System.out.printf("[Day 08 Part 2] Changing line: %s From: nop %s to jmp %s\n", i, argument, argument);
                        operation = "jmp";
                        changedLines.add(i);
                        changePossible = false;
                    }
                }

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
                if (i >= inputLines.size() - 1) {
                    System.out.printf("[Day 08 Part 2] Program finished successfully. Reached Line: %s\n", i + 1);
                    return acc;
                }
            }
        }
    }

    public static void main(String[] args) {
        String inputPath = "Day08/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 08 Part 1] [Result]: %s\n", day08Part1(inputs));
            System.out.println();
            System.out.printf("[Day 08 Part 2] [Result]: %s\n", day08Part2(inputs));
        } catch (IOException e) {
            System.out.println("[Day 08] [Error]: Error reading input.txt: " + e);
        }
    }

}
