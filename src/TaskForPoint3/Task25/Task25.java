package TaskForPoint3.Task25;

import java.util.Arrays;
import java.util.List;

public class Task25 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Panama", "na", "golove", "naglogo", "nigera");
        String str = String.join(",", stringList);

            //String convertStr = str.substring(1, str.length() - 1).replace("," , ",");

     //   IntStream stringStream  = convertStr.chars();
      //  stringStream.forEach(p-> System.out.println(p + " "));

        //Stream<Character> characterStream = convertStr.chars().mapToObj(c->(char) c);
       // System.out.println(characterStream.toString());
    }
}
