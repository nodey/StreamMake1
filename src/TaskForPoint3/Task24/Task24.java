package TaskForPoint3.Task24;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task24 {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person(0L,"Viktor", true));
        personArrayList.add(new Person(1L,"Vlad", false));
        personArrayList .add(new Person(2L,"Pasha", true));
        Task24.NameCollector(personArrayList);
    }

    public static void NameCollector(ArrayList<Person> arrayList){
        Map<String,List<Person>> dataCollectionMap = arrayList.stream()
                .collect(Collectors.groupingBy(element -> element.getName().substring(0,1)));

        Object[] keys =  dataCollectionMap.keySet().toArray();

        for(int i = 1; i < dataCollectionMap.size(); i++){
            if(dataCollectionMap. get(keys[i]).size() < 5){
                if( keys[i].toString().charAt(0) - keys[i - 1].toString().charAt(0) == 1 ){
                    String newKey;
                    if( keys[i - 1].toString().length() == 1 )
                        newKey = keys[i - 1].toString() + "-" + keys[i];
                    else
                        newKey = keys[i - 1].toString().substring(0,1) + keys[i];

                    dataCollectionMap.get(keys[i - 1]).addAll(dataCollectionMap.remove(keys[i]));
                    dataCollectionMap.put(newKey, dataCollectionMap.remove(keys[i - 1]));
                }
            }
        }

        keys =  dataCollectionMap.keySet().toArray();

        for (int i = 0; i < dataCollectionMap.size(); i++){
            System.out.println(" " + keys[i] + ":");
            dataCollectionMap.get(keys[i]).forEach(element-> System.out.println(element));
        }
    }
}
