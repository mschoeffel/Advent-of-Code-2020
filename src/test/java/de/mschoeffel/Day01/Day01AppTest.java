package de.mschoeffel.Day01;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day01AppTest {

    @Test
    public void testDay01Part1() throws IOException {
        String inputPath = "Day01/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(1006875, Day01App.day01Part1(inputs));
    }

    @Test
    public void testDay01Part2() throws IOException {
        String inputPath = "Day01/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(165026160, Day01App.day01Part2(inputs));
    }

}
