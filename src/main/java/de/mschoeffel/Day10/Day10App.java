package de.mschoeffel.Day10;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day10App {

    public static int day10Part1(List<String> inputLines) {

        List<Integer> number = new ArrayList<>();
        for (String num : inputLines) {
            number.add(Integer.parseInt(num));
        }
        number.sort(Comparator.comparingInt(Integer::intValue));
        int one = 2;
        int three = 1;

        for (int i = 0; i < number.size() - 2; i++) {
            int i1 = number.get(i);
            int i2 = number.get(i + 1);
            if (i2 - i1 == 1) {
                one++;
            }
            if (i2 - i1 == 3) {
                three++;
            }
            System.out.printf("[Day 10 Part 1] Checking Number %s with %s Diff: %s -> One: %s Three: %s\n", i1, i2, i2 - i1, one, three);
        }

        System.out.printf("[Day 10 Part 1] Result One: %s Three: %s Multiply: %s\n", one, three, one * three);
        return one * three;
    }

    public static long day10Part2(List<String> inputLines) {
        List<Integer> number = new ArrayList<>();
        for (String num : inputLines) {
            number.add(Integer.parseInt(num));
        }
        number.add(0);
        number.sort(Integer::compareTo);

        int len = number.size();
        long[] dp = new long[len];
        Arrays.fill(dp, -1);

        return calcWays(number, 0, dp);
    }

    public static long calcWays(List<Integer> numbers, int index, long[] dp) {
        if (index == numbers.size() - 1) {
            return 1;
        } else {
            if (dp[index] != -1) {
                return dp[index];
            } else {
                long count = 0;
                for (int i = index + 1; i <= Math.min(index + 3, numbers.size() - 1); i++) {
                    if (numbers.get(index) + 3 >= numbers.get(i)) {
                        count += calcWays(numbers, i, dp);
                    }
                }
                dp[index] = count;
                return count;
            }
        }
    }


    public static void main(String[] args) {
        String inputPath = "Day10/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 10 Part 1] [Result]: %s\n", day10Part1(inputs));
            System.out.println();
            System.out.printf("[Day 10 Part 2] [Result]: %s\n", day10Part2(inputs));
        } catch (IOException e) {
            System.out.println("[Day 10] [Error]: Error reading input.txt: " + e);
        }
    }

}
