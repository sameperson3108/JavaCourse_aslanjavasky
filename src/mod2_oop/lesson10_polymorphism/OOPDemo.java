package mod2_oop.lesson10_polymorphism;

import mod2_oop.lesson10_polymorphism.Person;
import mod2_oop.lesson10_polymorphism.StudentKT;

public class OOPDemo {
    static void main() {

        Person sameperson = new Person("semen");
        StudentKT solara = new StudentKT("solara");
        Person ivan = new Student("Ivan Ivanovich");

        System.out.println("Person instance sameperson.sayHello():");
        sameperson.sayHello();

        System.out.println("Student instance solara.sayHello():");
        solara.sayHello();

        System.out.println("Student instance of Person superclass ivan.sayHello():");
        ivan.sayHello();

    }
}
