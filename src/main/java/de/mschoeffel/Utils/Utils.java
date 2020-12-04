package de.mschoeffel.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<String> readFileLineByLine(String path) throws IOException {
        return Files.readAllLines(Paths.get(new File("").getAbsolutePath() + "/src/main/java/de/mschoeffel/" + path));
    }

    public static List<String> readFileSplitByEmptyLine(String path) throws IOException {
        List<String> stringList = new ArrayList<>();
        StringBuilder currentlyUsedString = new StringBuilder();
        List<String> inputLines = readFileLineByLine(path);
        for (String inputLine : inputLines) {
            if (inputLine.isEmpty()) {
                if (currentlyUsedString.length() > 0) {
                    stringList.add(currentlyUsedString.toString());
                }
                currentlyUsedString = new StringBuilder();
            } else {
                if (currentlyUsedString.length() == 0) {
                    currentlyUsedString = new StringBuilder(inputLine);
                } else {
                    currentlyUsedString.append(" ").append(inputLine);
                }
            }
        }
        stringList.add(currentlyUsedString.toString());
        return stringList;
    }

}
