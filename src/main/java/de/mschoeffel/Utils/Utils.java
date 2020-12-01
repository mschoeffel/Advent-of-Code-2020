package de.mschoeffel.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Utils {

    public static List<String> readFileLineByLine(String path) throws IOException {
        return Files.readAllLines(Paths.get(new File("").getAbsolutePath() + "/src/main/java/de/mschoeffel/" + path));
    }
}
