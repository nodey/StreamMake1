package TaskForPoint6.Task20;

import java.io.File;

public class Task20 {
    public static void main(String[] args) {
        File file = new File("C:\\maven/readmix.txt");
        System.out.println(new Task20().getLastNLogLines(file, 1000));
    }
    public String getLastNLogLines(File file, int nLines) {
        StringBuilder s = new StringBuilder();
        try {
            Process p = Runtime.getRuntime().exec("tail -"+nLines+" "+file);
            java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream()));
            String line = null;
            //Here we first read the next line into the variable
            //line and then check for the EOF condition, which
            //is the return value of null
            while((line = input.readLine()) != null){
                s.append(line+'\n');
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return s.toString();
    }
}
