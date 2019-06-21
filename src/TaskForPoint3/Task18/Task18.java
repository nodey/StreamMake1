package TaskForPoint3.Task18;

import java.util.ArrayList;
import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        System.out.println(Arrays.stream(array)
                .map( string-> new ArrayList(Arrays.asList(string)))
                .reduce(new ArrayList(), (strArray,str)->{
                    ArrayList tempArray = new ArrayList();

                    tempArray.addAll(strArray);
                    tempArray.add(str.get(0));

                    for(int number = 0;number<strArray.size();number++){
                        for (int pozition=0;pozition<=strArray.get(number).toString().length();pozition++){
                            String tempString = new String();
                            ArrayList tempStringArray = new ArrayList();

                            for(int i=0;i<strArray.get(number).toString().length();i++)
                                tempStringArray.add(strArray.get(number).toString().charAt(i));

                            tempStringArray.add(pozition,str.get(0).toString());

                            for (int i=0;i<strArray.get(number).toString().length()+1;i++)
                                tempString += tempStringArray.get(i).toString();

                            tempArray.add(tempString);
                        }
                    }
                    return tempArray;
                }));
    }


}
