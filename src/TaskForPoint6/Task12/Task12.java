package TaskForPoint6.Task12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task12 {
    public static void main(String [ ] args) throws FileNotFoundException {
        new Task12().findLongestWords();
    }

    public String findLongestWords() throws FileNotFoundException {

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("C:\\maven/README.txt"));


        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("\n"+longest_word+"\n");
        return longest_word;
    }
}
