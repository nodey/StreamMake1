package TaskForPoint6.Task22;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task22_1 {
    public static void main(String[] args) throws Exception {
        String filename = "C:\\maven/readmix.txt";
        readFile(filename);
    }

    public static List readFile(String filename) throws Exception {
        return Files.readAllLines(Paths.get(filename), StandardCharsets.US_ASCII);
    }
}