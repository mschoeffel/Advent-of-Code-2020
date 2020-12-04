package de.mschoeffel.Day04;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day04AppTest {

    @Test
    public void testDay04Part1() throws IOException {
        String inputPath = "Day04/input.txt";
        List<String> inputs = Utils.readFileSplitByEmptyLine(inputPath);
        Assertions.assertEquals(222, Day04App.day04Part1(inputs));
    }

    @Test
    public void testDay04Part2() throws IOException {
        String inputPath = "Day04/input.txt";
        List<String> inputs = Utils.readFileSplitByEmptyLine(inputPath);
        Assertions.assertEquals(140, Day04App.day04Part2(inputs));
    }

}
