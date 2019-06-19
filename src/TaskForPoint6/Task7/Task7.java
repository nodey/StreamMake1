package TaskForPoint6.Task7;

import java.io.IOException;

public class Task7 {
    public static void main(String[] args)
    {
        ReadFile rf = new ReadFile();

        // The text file location of your choice
        String filename = "C:\\maven/README.txt";

        try
        {
            String[] lines = rf.readLines(filename);

            for (String line : lines)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to create "+filename+": "+e.getMessage());
        }
    }
}
