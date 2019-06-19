package TaskForPoint6.Task5;

import java.io.File;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("C:\\maven/README.txt");
        System.out.println(filesize_in_kiloBytes(file));
    }

    private static String filesize_in_kiloBytes(File file) {
        return (double) file.length()/1024+"  kb";
    }
}
