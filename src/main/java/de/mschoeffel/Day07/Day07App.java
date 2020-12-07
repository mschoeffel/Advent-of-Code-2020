package de.mschoeffel.Day07;

import de.mschoeffel.Utils.Tuple;
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

    public static int day07Part2(List<String> inputLines) {
        int bags = 0;
        Map<String, List<Tuple<Integer, String>>> inputMap = new HashMap<>();

        for (String inputLine : inputLines) {
            Matcher srcMatcher = Pattern.compile("[a-z\\s]*(?= bags contain)").matcher(inputLine);
            Matcher destMatcher = Pattern.compile("[0-9]\\s[a-z\\s]*(?=\\s(bag[s]?,|bag[s]?.))").matcher(inputLine);
            String src = "";
            List<Tuple<Integer, String>> dest = new ArrayList<>();

            if (srcMatcher.find()) {
                src = srcMatcher.group();
            }

            while (destMatcher.find()) {
                String temp = destMatcher.group();
                String[] test = temp.split("\\s", 2);
                System.out.printf("[Day 07 Part 2] Line read Qnt: %s Str: %s\n", test[0], test[1]);
                dest.add(new Tuple<>(Integer.parseInt(test[0]), test[1]));
            }
            System.out.printf("[Day 07 Part 2] Line read Src: %s Dest: %s\n", src, dest);
            inputMap.put(src, dest);
        }

        Queue<Tuple<Integer, String>> search = new ArrayDeque<>();
        search.add(new Tuple<>(1, "shiny gold"));

        while (!search.isEmpty()) {
            Tuple<Integer, String> temp = search.poll();
            String tempStr = temp.getSecond();
            Integer tempQnt = temp.getFirst();
            System.out.printf("[Day 07 Part 2] Search in Map for: %s Size of queue: %s| Added to bags: %s -> %s\n", temp, search.size(), bags, bags + tempQnt);
            bags += tempQnt;
            if (inputMap.containsKey(tempStr)) {
                for (Tuple<Integer, String> tuple : inputMap.get(tempStr)) {
                    System.out.printf("[Day 07 Part 2] Found in Map for: %s: %s needed Qnt:%s\n", temp, tuple.getSecond(), tuple.getFirst());
                    search.add(new Tuple<>(tempQnt * tuple.getFirst(), tuple.getSecond()));
                }
            }
        }
        return bags - 1;
    }

    public static void main(String[] args) {
        String inputPath = "Day07/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 07 Part 1] [Result]: %s\n", day07Part1(inputs));
            System.out.println();
            System.out.printf("[Day 07 Part 2] [Result]: %s\n", day07Part2(inputs));
        } catch (IOException e) {
            System.out.println("[Day 07] [Error]: Error reading input.txt: " + e);
        }
    }

}
