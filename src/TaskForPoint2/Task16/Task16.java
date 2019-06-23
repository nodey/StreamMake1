package TaskForPoint2.Task16;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Task16 {
    public static void main(String args[]) {
        List<String> listA = new ArrayList<String>();

        listA.add("Z");
        listA.add("B");

        List<String> listB = new ArrayList<String>();

        listB.add("B");
        listB.add("C");
        listB.add("G");
        listB.add("A");

        Set<String> newSet = new HashSet<String>(listA);
        newSet.addAll(listB);

        List<String> newList = new ArrayList<String>(newSet);

        List<String> stringStream = newList.stream().collect(Collectors.toList());

        System.out.println("New List :" + stringStream);
    }
}