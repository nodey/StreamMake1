package TaskForPoint3.Task17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        String[][] strings1 = {{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}, {"i", "j"}, {"k", "l"}, {"m", "o"}};

        List<String[]> strings = new ArrayList<>(Arrays.asList(strings1));
        strings.stream().forEach(p-> System.out.println(combos(0, strings1, "")));
    }

    public static String combos(int pos, String[][] c, String soFar) {
        if (pos == c.length) {
            System.out.println(soFar);
            return soFar;
        }
        for (int i = 0; i != c[pos].length; i++) {
            combos(pos+1, c, soFar + c[pos][i]);
        }
        return soFar;
    }
}
