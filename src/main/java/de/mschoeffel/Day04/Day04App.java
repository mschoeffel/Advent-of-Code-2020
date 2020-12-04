package de.mschoeffel.Day04;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day04App {

    public static int day04Part1(List<String> inputLines) {
        int correctPassports = 0;

        for (String inputLine : inputLines) {
            Matcher byrMatcher = Pattern.compile("byr:").matcher(inputLine);
            Matcher iyrMatcher = Pattern.compile("iyr:").matcher(inputLine);
            Matcher eyrMatcher = Pattern.compile("eyr:").matcher(inputLine);
            Matcher hgtMatcher = Pattern.compile("hgt:").matcher(inputLine);
            Matcher hclMatcher = Pattern.compile("hcl:").matcher(inputLine);
            Matcher eclMatcher = Pattern.compile("ecl:").matcher(inputLine);
            Matcher pidMatcher = Pattern.compile("pid:").matcher(inputLine);

            if (byrMatcher.find() && iyrMatcher.find() && eyrMatcher.find() && hgtMatcher.find() && hclMatcher.find() && eclMatcher.find() && pidMatcher.find()) {
                correctPassports++;
                System.out.printf("[Day 04 Part 1] Valid Passport Found: %s\n", inputLine);
            }
        }
        return correctPassports;
    }

    public static void main(String[] args) {
        String inputPath = "Day04/input.txt";
        try {
            List<String> inputs = Utils.readFileSplitByEmptyLine(inputPath);
            System.out.printf("[Day 04 Part 1] [Result]: %s\n", day04Part1(inputs));
            System.out.println();
        } catch (IOException e) {
            System.out.println("[Day 04] [Error]: Error reading input.txt: " + e);
        }
    }

}
