package mod2_oop.lesson8_deep_copy;

import mod2_oop.lesson8_deep_copy.Person;
import mod2_oop.lesson8_deep_copy.PersonKT;

public class OOPDemo {
    static void main() {

//        примитивные типы хранятся в стеке
//        копирование по значению
        int int1 = 4;
        int int2 = 8;
        int int3 = int1;
        int3 = 15;
//        System.out.println(int1 == int2);
//        System.out.println(int1);

        // копирование по ссылке
        Person solara = Person.getInstance("solara");
        Person john = Person.getInstance("John");
//        Person somePerson = solara; // by reference
        Person somePerson = Person.getInstance(solara); // deep copy
        System.out.println(solara.getName());

    }
}
