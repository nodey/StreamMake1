package TaskForPoint6.Task4;

import java.io.File;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("C:\\maven");
        System.out.println(file.isDirectory() + " " + file.isFile());
    }
}
