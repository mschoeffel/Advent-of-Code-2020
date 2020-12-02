package de.mschoeffel.Day02;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day02AppTest {

    @Test
    public void testDay02Part1() throws IOException {
        String inputPath = "Day02/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(569, Day02App.day02Part1(inputs));
    }

    @Test
    public void testDay02Part2() throws IOException {
        String inputPath = "Day02/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(346, Day02App.day02Part2(inputs));
    }

}
