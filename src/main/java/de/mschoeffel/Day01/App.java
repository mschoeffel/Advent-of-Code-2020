package de.mschoeffel.Day01;

import de.mschoeffel.Utils.Tuple;
import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static int day01Part1() {
        String path = "Day01/input.txt";
        try {
            Set<Tuple<Integer, Integer>> tuples = new HashSet<>();
            Set<Integer> numbers = new HashSet<>();
            Utils.readFileLineByLine(path).forEach(line -> {
                int number = Integer.parseInt(line);
                numbers.add(number);
                tuples.add(new Tuple<>(number, 2020 - number));
            });
            for (Tuple<Integer, Integer> tuple : tuples) {
                if (numbers.contains(tuple.getSecond())) {
                    System.out.printf("Pair found: {%s ; %s}\n", tuple.getFirst(), tuple.getSecond());
                    int multiplication = tuple.getFirst() * tuple.getSecond();
                    System.out.printf("Multiplication: %s\n", multiplication);
                    return multiplication;
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e);
        }
        return 0;
    }

    public static void main(String[] args) {
        day01Part1();
    }

}
