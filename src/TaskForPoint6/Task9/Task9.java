package TaskForPoint6.Task9;

import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\maven/README.txt";
        String appendText = "HELLO BITCHES";
        appendUsingFileOutputStream(filePath, appendText);
        System.out.println(filePath);
    }

    private static void appendUsingFileOutputStream(String fileName, String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File(fileName), true);
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
