package de.mschoeffel.Day07;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day07App {

    public static int day07Part1(List<String> inputLines) {
        Set<String> bags = new HashSet<>();
        Map<String, List<String>> inputMap = new HashMap<>();

        for (String inputLine : inputLines) {
            Matcher srcMatcher = Pattern.compile("[a-z\\s]*(?= bags contain)").matcher(inputLine);
            Matcher destMatcher = Pattern.compile("(?<=[0-9]\\s)[a-z\\s]*(?=\\s(bag[s]?,|bag[s]?.))").matcher(inputLine);
            String src = "";
            List<String> dest = new ArrayList<>();

            if (srcMatcher.find()) {
                src = srcMatcher.group();
            }

            while (destMatcher.find()) {
                dest.add(destMatcher.group());
            }
            System.out.printf("[Day 07 Part 1] Line read Src: %s Dest: %s\n", src, dest);
            inputMap.put(src, dest);
        }

        Queue<String> search = new PriorityQueue<>();
        search.add("shiny gold");

        while (!search.isEmpty()) {
            String temp = search.poll();
            System.out.printf("[Day 07 Part 1] Search in Map for: %s Size: %s\n", temp, search.size());
            inputMap.forEach((k, v) -> {
                if (v.contains(temp)) {
                    search.add(k);
                    bags.add(k);
                    System.out.printf("[Day 07 Part 1] Found bigger Bag for %s in Map: %s\n", temp, k);
                }
            });
        }

        return bags.size();
    }

    public static void main(String[] args) {
        String inputPath = "Day07/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 07 Part 1] [Result]: %s\n", day07Part1(inputs));
            System.out.println();
        } catch (IOException e) {
            System.out.println("[Day 07] [Error]: Error reading input.txt: " + e);
        }
    }

}
