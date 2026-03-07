package mod2_oop.lesson12_Object_Any;

import mod2_oop.lesson12_Object_Any.Person;
import mod2_oop.lesson12_Object_Any.Student;
import mod2_oop.lesson12_Object_Any.StudentKT;

public class OOPDemo {
    static void main() {

        Person solara = Student.getInstance("solara", 20, 4);
        System.out.println(solara);

    }
}
