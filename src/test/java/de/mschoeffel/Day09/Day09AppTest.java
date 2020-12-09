package de.mschoeffel.Day09;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day09AppTest {

    @Test
    public void testDay09Part1() throws IOException {
        String inputPath = "Day09/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(257342611, Day09App.day09Part1(inputs));
    }

    @Test
    public void testDay09Part2() throws IOException {
        String inputPath = "Day09/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(35602097, Day09App.day09Part2(inputs));
    }

}
