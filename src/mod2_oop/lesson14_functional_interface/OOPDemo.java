package mod2_oop.lesson14_functional_interface;


public class OOPDemo {
    static void main() {
        //with classes which implements Greeting interface
//        Greeting englishGreeting = new EnglishGreeting();
//        englishGreeting.sayHello();
//        Greeting frencheGreeting = new FrenchGreeting();
//        frencheGreeting.sayHello();

        Greeting englishGreetig = name -> System.out.println("Hello, " + name);
        englishGreetig.sayHello("solara");

        Greeting frenchGreeting = name -> System.out.println("Bonjour, " + name);
        frenchGreeting.sayHello("sameperson");

    }
}
