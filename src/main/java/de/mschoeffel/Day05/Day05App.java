package de.mschoeffel.Day05;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.List;

public class Day05App {

    public static int day05Part1(List<String> inputLines) {
        int highesSeatId = 0;
        for (String inputLine : inputLines) {
            int rowMin = 0;
            int rowMax = 127;
            int columnMin = 0;
            int columnMax = 7;

            for (int i = 0; i < 7; i++) {
                char c = inputLine.charAt(i);
                switch (c) {
                    case 'B':
                        rowMin = (Math.round((rowMax - rowMin) / 2f) + rowMin);
                        break;
                    case 'F':
                        rowMax = (rowMax - Math.round((rowMax - rowMin) / 2f));
                        break;
                }
            }
            if (rowMin == rowMax) {
                System.out.printf("[Day 05 Part 1] Row of Ticket: %s found: %s\n", inputLine, rowMin);
            }
            for (int i = 7; i < 10; i++) {
                char c = inputLine.charAt(i);
                switch (c) {
                    case 'L':
                        columnMax = columnMax - Math.round((columnMax - columnMin) / 2f);
                        break;
                    case 'R':
                        columnMin = Math.round((columnMax - columnMin) / 2f) + columnMin;
                        break;
                }
            }
            if (columnMin == columnMax) {
                System.out.printf("[Day 05 Part 1] Column of Ticket: %s found: %s\n", inputLine, columnMin);
            }
            if (rowMin == rowMax && columnMin == columnMax) {
                int tempHighestSeatId = rowMin * 8 + columnMin;
                System.out.printf("[Day 05 Part 1] Seat ID of Ticket: %s calculated: %s\n", inputLine, tempHighestSeatId);
                if (tempHighestSeatId > highesSeatId) {
                    System.out.printf("[Day 05 Part 1] Seat ID of Ticket: %s was higher than current: Old: %s New: %s\n", inputLine, highesSeatId, tempHighestSeatId);
                    highesSeatId = tempHighestSeatId;
                }
            }
        }
        return highesSeatId;
    }

    public static void main(String[] args) {
        String inputPath = "Day05/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 05 Part 1] [Result]: %s\n", day05Part1(inputs));
            System.out.println();
        } catch (IOException e) {
            System.out.println("[Day 05] [Error]: Error reading input.txt: " + e);
        }
    }

}
