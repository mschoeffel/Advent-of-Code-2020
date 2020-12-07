package de.mschoeffel.Day06;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day06AppTest {

    @Test
    public void testDay06Part1() throws IOException {
        String inputPath = "Day06/input.txt";
        List<String> inputs = Utils.readFileSplitByEmptyLine(inputPath);
        Assertions.assertEquals(6504, Day06App.day06Part1(inputs));
    }

    @Test
    public void testDay06Part2() throws IOException {
        String inputPath = "Day06/input.txt";
        List<String> inputs = Utils.readFileSplitByEmptyLine(inputPath);
        Assertions.assertEquals(3351, Day06App.day06Part2(inputs));
    }

}
