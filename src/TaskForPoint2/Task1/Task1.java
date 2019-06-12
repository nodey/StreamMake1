package TaskForPoint2.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Using conveyor methods
public class Task1 {
    public static void main(String[] args) {

        //Using method "filter" for output odd values of array
        List<Integer> integerList = new ArrayList<>();//Arrays.asList(1, 3, 4, 5, 6, 7, 2, 1, 4): function for fast add values in array
        integerList.add(1);//simple add function for value in array
        integerList.add(3);//simple add function for value in array
        integerList.add(4);//simple add function for value in array
        integerList.add(5);//simple add function for value in array
        integerList.add(6);//simple add function for value in array
        integerList.add(7);//simple add function for value in array
        integerList.add(2);//simple add function for value in array
        integerList.add(1);//simple add function for value in array
        integerList.add(4);//simple add function for value in array

        Stream<Integer> integerStream = integerList.stream(); //start stream of array
        System.out.println("integer list: " + integerStream.filter(x -> x % 2 != 0).collect(Collectors.toList())); //output stream of array in console
    }
}
