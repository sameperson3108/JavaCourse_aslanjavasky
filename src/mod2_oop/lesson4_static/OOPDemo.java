package mod2_oop.lesson4_static;

import mod2_oop.lesson4_static.Person;
import mod2_oop.lesson4_static.PersonKT;

public class OOPDemo {
    static void main() {

        Person solara = new Person();
        solara.setName("Semen");
        solara.setAge(20);
        solara.sayHello();
        System.out.println(solara.getName() + " " + solara.getAge());
        System.out.println("The kind of Person is " + Person.getKIND());

        Person sveta = new Person("Sveta", 19);
        sveta.sayHello();

        //kotlin
        PersonKT kotlinPerson = new PersonKT();
        kotlinPerson.setName("sameperson");
        kotlinPerson.setAge(20);
        kotlinPerson.sayHello();
        System.out.println("The kind of Person is " + PersonKT.KIND);
    }
}
