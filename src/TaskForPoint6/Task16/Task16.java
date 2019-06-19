package TaskForPoint6.Task16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Task16 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\maven/readmix.txt");
            FileOutputStream fout = new FileOutputStream(file);
            PrintStream out = new PrintStream(fout);
            out.println("some text");
        } catch (IOException ex) {
            System.out.println("There was a problem creating/writing to the file");
            ex.printStackTrace();
        }
    }
}
