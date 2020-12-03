package de.mschoeffel.Day03;

import de.mschoeffel.Utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class Day03AppTest {

    @Test
    public void testDay03Part1() throws IOException {
        String inputPath = "Day03/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(292, Day03App.day03Part1(inputs));
    }

    @Test
    public void testDay03Part2() throws IOException {
        String inputPath = "Day03/input.txt";
        List<String> inputs = Utils.readFileLineByLine(inputPath);
        Assertions.assertEquals(9354744432L, Day03App.day03Part2(inputs));
    }
}
