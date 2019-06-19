package TaskForPoint6.Task3;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("C:\\maven/README.txt");
        System.out.println(file.isFile());
        System.out.println(file.exists());
    }
}
