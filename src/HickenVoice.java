import java.io.File;
import java.io.FileNotFoundException;
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

        //Стрим из листа
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        Stream<String> stream = list.stream();

        //Стрим из массива
        String[] array = {"a1", "a2", "a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);
        System.out.println("streamFromArrays: " + streamFromArrays.collect(Collectors.toList()));

        //Стрим из файла
       File file = new File("string.txt");
       file.deleteOnExit();
       PrintWriter out =  new PrintWriter(file);
       out.println("a1");
       out.println("a2");
       out.println("a3");
       out.close();
       Stream<String> streamFromFiles = Files.lines(Paths.get(file.getAbsolutePath()));
        System.out.println("streamFromfiles: " + streamFromFiles.collect(Collectors.toList()));


        //Стрим из строки
        IntStream streamFromString = "A string".chars();
        System.out.println("streamFromString: ");
        streamFromString.forEach((e)-> System.out.println(e + " , "));
        System.out.println();

        //Параллельный стрим
        Stream<String> parallStream = list.parallelStream();
        System.out.println("parallStream = " + parallStream.collect(Collectors.toList()));

        //Бесконечный стрим каждое значение которого умножаетсяч на 2
        Stream<Integer> streamFromIterate = Stream.iterate(2, n -> n * n);
        System.out.println("streamFromIterate: " + streamFromIterate.limit(5).collect(Collectors.toList()));


    }
}
