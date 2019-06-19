package TaskForPoint2.Task17;

import java.util.ArrayList;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        String[] strings = new String[] {"1:2:3", "foo:bar"};
        List list = new ArrayList<>();
        for(String str:strings){
            String[] strings1 = str.split(":", 0);
            for (String sa:strings1){
                list.add(sa);
            }
        }
        System.out.println(list);
    }
}
