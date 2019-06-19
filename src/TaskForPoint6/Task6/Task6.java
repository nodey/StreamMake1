package TaskForPoint6.Task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task6 {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\maven/README.txt");
        try {
            byte[] bArray = Files.readAllBytes(path);
            // reading content from byte array
            for (int i = 0; i < bArray.length; i++){
                System.out.print((char) bArray[i]);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
