package de.mschoeffel.Day05;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day05AppTest {

    @Test
    public void testDay05Part1() throws IOException {
        String inputPath = "Day05/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(858, Day05App.day05Part1(inputs));
    }

    @Test
    public void testDay05Part2() throws IOException {
        String inputPath = "Day05/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(557, Day05App.day05Part2(inputs));
    }

}
