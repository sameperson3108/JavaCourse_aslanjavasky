package mod4_collections.lesson3_set;

import java.util.*;

public class SetDemo {
    static void main() {

        List<String> names = new LinkedList<>();
        names.add("sameperson");
        names.add("john");
        names.add("sveta");

        System.out.println(names);

        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Petr");
        setOfNames.addAll(names);

        System.out.println("setOfNames: " + setOfNames);

        Set<String> sortedSetOfNames = new TreeSet<>(); //отсортированный сет
        sortedSetOfNames.add("zoltan");
        sortedSetOfNames.addAll(setOfNames);
        System.out.println("sortedSetOfNames: " + sortedSetOfNames);
    }
}
