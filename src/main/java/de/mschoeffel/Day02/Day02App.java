package de.mschoeffel.Day02;

import de.mschoeffel.Utils.Utils;

import java.io.IOException;
import java.util.List;

public class Day02App {

    public static int day02Part1(List<String> inputLines) {
        int correctPasswords = 0;

        for (String inputLine : inputLines) {
            int min = Integer.parseInt(inputLine.substring(0, inputLine.indexOf('-')));
            int max = Integer.parseInt(inputLine.substring(inputLine.indexOf('-') + 1, inputLine.indexOf(' ')));
            char c = inputLine.substring(inputLine.indexOf(' ') + 1, inputLine.indexOf(':')).charAt(0);
            String password = inputLine.substring(inputLine.indexOf(':') + 2);

            if (isPasswordOccurrCorrect(min, max, c, password)) {
                System.out.printf("[Day 02 Part 1] Valid Password Found: Occurr[%s-%s] Char[%s] %s\n", min, max, c, password);
                correctPasswords++;
            }
        }

        return correctPasswords;
    }

    public static boolean isPasswordOccurrCorrect(int min, int max, char c, String password) {
        char[] passwordChars = password.toCharArray();
        int occurrences = 0;

        for (char p : passwordChars) {
            if (p == c) {
                occurrences++;
            }
        }

        return (occurrences >= min && occurrences <= max);
    }

    public static int day02Part2(List<String> inputLines) {
        int correctPasswords = 0;

        for (String input : inputLines) {
            int posOne = Integer.parseInt(input.substring(0, input.indexOf('-')));
            int posTwo = Integer.parseInt(input.substring(input.indexOf('-') + 1, input.indexOf(' ')));
            char c = input.substring(input.indexOf(' ') + 1, input.indexOf(':')).charAt(0);
            String password = input.substring(input.indexOf(':') + 2);

            if (isPasswordPosCorrect(posOne, posTwo, c, password)) {
                System.out.printf("[Day 02 Part 2] Valid Password Found: Pos[%s, %s] Char[%s] %s\n", posOne, posTwo, c, password);
                correctPasswords++;
            }
        }

        return correctPasswords;
    }

    public static boolean isPasswordPosCorrect(int posOne, int posTwo, char c, String password) {
        return ((password.charAt(posOne - 1) == c && password.charAt(posTwo - 1) != c)
                || (password.charAt(posOne - 1) != c && password.charAt(posTwo - 1) == c));
    }

    public static void main(String[] args) {
        String inputPath = "Day02/input.txt";
        try {
            List<String> inputs = Utils.readFileLineByLine(inputPath);
            System.out.printf("[Day 02 Part 1] [Result]: %s\n", day02Part1(inputs));
            System.out.println();
            System.out.printf("[Day 02 Part 2] [Result]: %s\n", day02Part2(inputs));
        } catch (IOException e) {
            System.out.println("[Day 02] [Error]: Error reading input.txt: " + e);
        }
    }

}
