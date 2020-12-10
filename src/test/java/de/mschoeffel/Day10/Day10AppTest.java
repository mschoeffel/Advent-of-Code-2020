package de.mschoeffel.Day10;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day10AppTest {

    @Test
    public void testDay10Part1() throws IOException {
        String inputPath = "Day10/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(2040, Day10App.day10Part1(inputs));
    }

    @Test
    public void testDay10Part1Example() throws IOException {
        String inputPath = "Day10/inputExample.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(220, Day10App.day10Part1(inputs));
    }

    @Test
    public void testDay10Part1ExampleSimple() throws IOException {
        String inputPath = "Day10/inputExampleSimple.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(32, Day10App.day10Part1(inputs));
    }

    @Test
    public void testDay10Part2() throws IOException {
        String inputPath = "Day10/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(28346956187648L, Day10App.day10Part2(inputs));
    }

    @Test
    public void testDay10Part2Example() throws IOException {
        String inputPath = "Day10/inputExample.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(19208L, Day10App.day10Part2(inputs));
    }

    @Test
    public void testDay10Part2ExampleSimple() throws IOException {
        String inputPath = "Day10/inputExampleSimple.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(8L, Day10App.day10Part2(inputs));
    }

}
