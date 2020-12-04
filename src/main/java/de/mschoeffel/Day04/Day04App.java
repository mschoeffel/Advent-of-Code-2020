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
                System.out.printf("[Day 04 Part 1] Valid Passport found: %s\n", inputLine);
            }
        }
        return correctPassports;
    }

    public static int day04Part2(List<String> inputLines) {
        int correctPassports = 0;

        for (String inputLine : inputLines) {
            Matcher byrMatcher = Pattern.compile("(?<=byr:)(19[2-9][0-9]|200[0-2])\\b").matcher(inputLine);
            Matcher iyrMatcher = Pattern.compile("(?<=iyr:)20(1[0-9]|20)\\b").matcher(inputLine);
            Matcher eyrMatcher = Pattern.compile("(?<=eyr:)20(2[0-9]|30)\\b").matcher(inputLine);
            Matcher hgtMatcher = Pattern.compile("(?<=hgt:)(1([5-8][0-9]|9[0-3])cm|(59|(6[0-9]|7[0-6]))in)\\b").matcher(inputLine);
            Matcher hclMatcher = Pattern.compile("(?<=hcl:)#[a-f0-9]{6}\\b").matcher(inputLine);
            Matcher eclMatcher = Pattern.compile("(?<=ecl:)(amb|(blu|(brn|(gry|(grn|(hzl|oth))))))\\b").matcher(inputLine);
            Matcher pidMatcher = Pattern.compile("(?<=pid:)\\d{9}\\b").matcher(inputLine);

            if (byrMatcher.find() && iyrMatcher.find() && eyrMatcher.find() && hgtMatcher.find() && hclMatcher.find() && eclMatcher.find() && pidMatcher.find()) {
                correctPassports++;
                System.out.printf("[Day 04 Part 2] Valid Passport found: %s\n", inputLine);
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
            System.out.printf("[Day 04 Part 2] [Result]: %s\n", day04Part2(inputs));
        } catch (IOException e) {
            System.out.println("[Day 04] [Error]: Error reading input.txt: " + e);
        }
    }

}
