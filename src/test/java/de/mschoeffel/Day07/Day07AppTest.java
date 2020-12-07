package de.mschoeffel.Day07;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day07AppTest {

    @Test
    public void testDay07Part1() throws IOException {
        String inputPath = "Day07/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(185, Day07App.day07Part1(inputs));
    }

    @Test
    public void testDay07Part2() throws IOException {
        String inputPath = "Day07/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(89084, Day07App.day07Part2(inputs));
    }

}
