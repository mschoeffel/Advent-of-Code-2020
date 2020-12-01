package de.mschoeffel.Day01;

import de.mschoeffel.Utils.Tuple;
import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static int day01Part1(List<String> inputs) {
        Set<Tuple<Integer, Integer>> numberAndSearchTuples = new HashSet<>();
        Set<Integer> numberPool = new HashSet<>();
        inputs.forEach(line -> {
            int numberOfLine = Integer.parseInt(line);
            numberPool.add(numberOfLine);
            numberAndSearchTuples.add(new Tuple<>(numberOfLine, 2020 - numberOfLine));
        });
        for (Tuple<Integer, Integer> tuple : numberAndSearchTuples) {
            if (numberPool.contains(tuple.getSecond())) {
                System.out.printf("Pair found: {%s ; %s}\n", tuple.getFirst(), tuple.getSecond());
                int multiplication = tuple.getFirst() * tuple.getSecond();
                System.out.printf("Multiplication: %s\n", multiplication);
                return multiplication;
            }
        }
        return 0;
    }

    public static int day01Part2(List<String> inputs) {
        Set<Integer> numberPool = new HashSet<>();
        inputs.forEach(line -> numberPool.add(Integer.parseInt(line)));
        List<Integer> resultNumbers = new ArrayList<>();
        if (findNumber(2020, 2, numberPool, resultNumbers)) {
            System.out.printf("Triple found: {%s, %s, %s}\n", resultNumbers.get(0), resultNumbers.get(1), resultNumbers.get(2));
            Integer multiplication = 1;
            for (Integer nextResultNumber : resultNumbers) {
                multiplication *= nextResultNumber;

            }
            System.out.printf("Multiplication: %s\n", multiplication);
            return multiplication;
        }
        return 0;
    }

    private static boolean findNumber(Integer numberToFind, Integer currentDepth, Set<Integer> numberPool, List<Integer> resultNumbers) {
        if (currentDepth == 0 && numberToFind > 0) {
            if (numberPool.contains(numberToFind)) {
                resultNumbers.add(numberToFind);
                return true;
            }
        } else if (currentDepth > 0 && numberToFind > 0) {
            for (Integer nextNumberOfPool : numberPool) {
                int nextNumberToFind = numberToFind - nextNumberOfPool;
                if (nextNumberToFind > 0 && findNumber(nextNumberToFind, currentDepth - 1, numberPool, resultNumbers)) {
                    resultNumbers.add(nextNumberOfPool);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String inputPath = "Day01/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Result] Day 01 Part 1: %s\n", day01Part1(inputs));
            System.out.printf("[Result] Day 01 Part 2: %s\n", day01Part2(inputs));
        } catch (IOException e) {
            System.out.println("ERROR: " + e);
        }
    }

}
