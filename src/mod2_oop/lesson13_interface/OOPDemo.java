package mod2_oop.lesson13_interface;

import mod2_oop.lesson13_interface.Person;
import mod2_oop.lesson13_interface.Student;
import mod2_oop.lesson13_interface.StudentKT;

public class OOPDemo {
    static void main() {

        Person solara = Student.getInstance("solara", 20, 4);
        System.out.println(solara);

    }
}
