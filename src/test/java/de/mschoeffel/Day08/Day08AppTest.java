package de.mschoeffel.Day08;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day08AppTest {

    @Test
    public void testDay08Part1() throws IOException {
        String inputPath = "Day08/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(1331, Day08App.day08Part1(inputs));
    }

    @Test
    public void testDay08Part1Example() throws IOException {
        String inputPath = "Day08/inputExample.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(5, Day08App.day08Part1(inputs));
    }

    @Test
    public void testDay08Part2() throws IOException {
        String inputPath = "Day08/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(1121, Day08App.day08Part2(inputs));
    }

    @Test
    public void testDay08Part2Example() throws IOException {
        String inputPath = "Day08/inputExample.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(8, Day08App.day08Part2(inputs));
    }

}
