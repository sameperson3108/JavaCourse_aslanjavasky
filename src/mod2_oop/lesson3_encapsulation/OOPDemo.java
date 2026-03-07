package mod2_oop.lesson3_encapsulation;

import mod2_oop.lesson3_encapsulation.Person;
import mod2_oop.lesson3_encapsulation.PersonKT;

public class OOPDemo {
    static void main() {

        Person solara = new Person();
        solara.setName("Semen");
        solara.setAge(20);
        solara.sayHello();
        System.out.println(solara.getName() + " " + solara.getAge());

        Person sveta = new Person("Sveta", 19);
        sveta.sayHello();

        //kotlin
        PersonKT kotlinPerson = new PersonKT();
        kotlinPerson.setName("sameperson");
        kotlinPerson.setAge(20);
        kotlinPerson.sayHello();
    }
}
