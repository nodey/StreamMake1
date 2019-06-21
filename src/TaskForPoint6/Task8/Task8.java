package TaskForPoint6.Task8;

import java.io.*;

public class Task8 {
    public static void main(String[] args) throws IOException {
        ObjectInputStream out = null;
        try {
            out = new ObjectInputStream(new FileInputStream("C:\\maven/readmixxxxxx.txt"));
            out.read();
            // use out
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                }
                catch (IOException e) {
                    // nothing to do here except log the exception
                }
            }
        }
}}
