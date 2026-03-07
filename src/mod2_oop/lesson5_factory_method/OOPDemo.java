package mod2_oop.lesson5_factory_method;

import mod2_oop.lesson5_factory_method.Person;
import mod2_oop.lesson5_factory_method.PersonKT;

public class OOPDemo {
    static void main() {

        //Person solara = new Person();
        Person solara = Person.getInstance();
        solara.setName("Semen");
        solara.setAge(20);
        solara.sayHello();
        System.out.println(solara.getName() + " " + solara.getAge());
        System.out.println("The kind of Person is " + Person.getKIND());

        //Person sveta = new Person("Sveta");
        Person sveta = Person.getInstance("Sveta");
        sveta.sayHello();

        //kotlin
       //  PersonKT kotlinPerson = new PersonKT();
        PersonKT sameperson = PersonKT.Companion.getInstance();
        sameperson.setName("sameperson");
        sameperson.setAge(20);
        sameperson.sayHello();
        System.out.println("The kind of Person is " + PersonKT.KIND);
    }
}
