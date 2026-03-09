package mod4_collections.lesson2_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    static void main() {

        //Array
//        String[] arr = {"sameperson", "john", "sveta"};
//        for (String name : arr) {
//            System.out.println(name);
//        }

        LinkedList<String> names = new LinkedList<>();
        names.add("sameperson");
        names.add("john");
        names.add("sveta");

        System.out.println(names);
        System.out.println("The first element is " + names.get(0));
        System.out.println("The last element is " + names.get(names.size() - 1));

        names.set(1, "solara");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        System.out.println("The list contains \"sameperson\": " + names.contains("sameperson"));
    }
}
