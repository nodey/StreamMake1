package TasksForPoint1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

enum Chars{
    a1, a2, a3
}

public class HickenVoice {
    public static void main(String[] args) throws IOException {

        //Stream by List
        List<String> list = new ArrayList<>(); //Make a list
        list.add("a1");//simple add function for value in list
        list.add("a2");//simple add function for value in array
        list.add("a3");//simple add function for value in array
        Stream<String> stream = list.stream();//start stream of list

        //Stream by Array
        String[] array = {"a1", "a2", "a3"};//Make array
        Stream<String> streamFromArrays = Arrays.stream(array); //start stream of array
        System.out.println("streamFromArrays: " + streamFromArrays.collect(Collectors.toList())); //output stream of array

        //Stream By File
       File file = new File("string.txt"); //Make file for input values
       file.deleteOnExit(); //function for delete file after finish program
       PrintWriter out =  new PrintWriter(file); //Start work with file
       out.println("a1");//simple add function for value in array
       out.println("a2");//simple add function for value in array
       out.println("a3");//simple add function for value in array
       out.close();//End work with values of file
       Stream<String> streamFromFiles = Files.lines(Paths.get(file.getAbsolutePath())); //start stream of file
        System.out.println("streamFromfiles: " + streamFromFiles.collect(Collectors.toList())); //output stream of file


        //Stream by string
        IntStream streamFromString = "A string".chars(); //Start stream of string
        System.out.println("streamFromString: ");
        streamFromString.forEach((e)-> System.out.println(e + " , "));//output stream of string
        System.out.println();

        //Parallel Stream
        Stream<String> parallStream = list.parallelStream(); //Start to parallel stream
        System.out.println("parallStream = " + parallStream.collect(Collectors.toList())); //output of parallel stream

        //Endless stream where eny next value since the first squared
        Stream<Integer> streamFromIterate = Stream.iterate(2, n -> n * n); //Start stream with condition for squared
        System.out.println("streamFromIterate: " + streamFromIterate.limit(5).collect(Collectors.toList())); //output endless stream with condition


    }
}
