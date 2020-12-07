package de.mschoeffel.Day06;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.*;

public class Day06App {

    public static int day06Part1(List<String> inputLines) {
        int questions = 0;
        for (String inputLine : inputLines) {
            inputLine = inputLine.replaceAll(" ", "");
            Set<Character> charSet = new HashSet<>();
            char[] chars = inputLine.toCharArray();
            for (char c : chars) {
                charSet.add(c);
            }
            questions += charSet.size();
        }
        return questions;
    }

    public static int day06Part2(List<String> inputLines) {
        int questions = 0;
        for (String inputLine : inputLines) {
            int persons = inputLine.split(" ").length;
            Map<Character, Integer> charSet = new HashMap<>();
            char[] chars = inputLine.toCharArray();
            for (char c : chars) {
                if (charSet.containsKey(c)) {
                    charSet.put(c, charSet.get(c) + 1);
                } else {
                    charSet.put(c, 1);
                }
            }

            for (Integer i : charSet.values()) {
                if (i >= persons) {
                    questions++;
                }
            }
        }
        return questions;
    }

    public static void main(String[] args) {
        String inputPath = "Day06/input.txt";
        try {
            List<String> inputs = Utils.readFileSplitByEmptyLine(inputPath);
            System.out.printf("[Day 06 Part 1] [Result]: %s\n", day06Part1(inputs));
            System.out.println();
            System.out.printf("[Day 06 Part 2] [Result]: %s\n", day06Part2(inputs));
        } catch (IOException e) {
            System.out.println("[Day 06] [Error]: Error reading input.txt: " + e);
        }
    }

}
