package de.mschoeffel.Day05;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day05App {

    public static int day05Part1(List<String> inputLines) {
        int highestSeatId = 0;
        for (String inputLine : inputLines) {
            int tempHighestSeatId = calculateIdOfTicket(inputLine);
            if (tempHighestSeatId > highestSeatId) {
                System.out.printf("[Day 05 Part 1] Seat ID of Ticket: %s was higher than current: Old: %s New: %s\n", inputLine, highestSeatId, tempHighestSeatId);
                highestSeatId = tempHighestSeatId;
            }
        }
        return highestSeatId;
    }

    private static int calculateIdOfTicket(String ticket) {
        int id = 0;
        int rowMin = 0;
        int rowMax = 127;
        int columnMin = 0;
        int columnMax = 7;

        for (int i = 0; i < 7; i++) {
            char c = ticket.charAt(i);
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
            System.out.printf("[Day 05 Part 1 OR 2] Row of Ticket: %s found: %s\n", ticket, rowMin);
        }
        for (int i = 7; i < 10; i++) {
            char c = ticket.charAt(i);
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
            System.out.printf("[Day 05 Part 1 OR 2] Column of Ticket: %s found: %s\n", ticket, columnMin);
        }
        if (rowMin == rowMax && columnMin == columnMax) {
            System.out.printf("[Day 05 Part 1 OR 2] Seat ID of Ticket: %s calculated: %s\n", ticket, id);
            id = rowMin * 8 + columnMin;
        }
        return id;
    }

    public static int day05Part2(List<String> inputLines) {
        int emptySeatId = 0;
        List<Integer> occupiedSeats = new ArrayList<>();
        for (String inputLine : inputLines) {
            occupiedSeats.add(calculateIdOfTicket(inputLine));
        }

        Collections.sort(occupiedSeats);
        int prev = 0;
        for (int i : occupiedSeats) {
            if (prev == i - 2) {
                emptySeatId = i - 1;
                System.out.printf("[Day 05 Part 2] Empty Seat found: %s\n", emptySeatId);
            }
            prev = i;
        }
        return emptySeatId;
    }

    public static void main(String[] args) {
        String inputPath = "Day05/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 05 Part 1] [Result]: %s\n", day05Part1(inputs));
            System.out.println();
            System.out.printf("[Day 05 Part 2] [Result]: %s\n", day05Part2(inputs));
        } catch (IOException e) {
            System.out.println("[Day 05] [Error]: Error reading input.txt: " + e);
        }
    }

}
