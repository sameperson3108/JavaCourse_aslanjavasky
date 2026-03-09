package mod4_collections.lesson4_map;

import java.util.*;

public class MapDemo {
    static void main() {
        Map<String, Integer> mapOfPeople = new HashMap<>();
        mapOfPeople.put("solara", 20);
        mapOfPeople.put("sun", 10);
        mapOfPeople.put("petr", 15);

        System.out.println(mapOfPeople);
//        System.out.println("The sun age is " + mapOfPeople.get("sun") + "years");
//
//        for (Map.Entry<String, Integer> entry : mapOfPeople.entrySet()) {
//            String name = entry.getKey();
//            Integer age = entry.getValue();
//            System.out.println("name = " + name + ", age = " + age);
//        }

        Map<String, Integer> mapLinked = new LinkedHashMap<>();
        mapLinked.putAll(mapOfPeople);

        Map<String, Integer> sortedMapOfNames = new TreeMap<>();
        sortedMapOfNames.putAll(mapOfPeople);
        System.out.println(sortedMapOfNames);
    }
}
