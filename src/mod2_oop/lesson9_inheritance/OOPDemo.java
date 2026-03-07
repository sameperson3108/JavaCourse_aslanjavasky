package mod2_oop.lesson9_inheritance;

import mod2_oop.lesson8_deep_copy.Person;

public class OOPDemo {
    static void main() {


//        Person sameperson = Person.getInstance("semen kondratenko");
//        Student solara = Student.getInstance("solara");

        Person sameperson = new Person("semen");
        StudentKT solara = new StudentKT("solara");

        sameperson.sayHello();
        solara.sayHello();

    }
}
