package mod2_oop.lesson18_comparable;

import mod2_oop.lesson18_comparable.Greeting;

public class Person implements Greeting {

    protected String name;
    private int age;
    private static final String KIND = "HUMAN";


    public static String getKIND() {
        return KIND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        name = "";
        age = 0;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }


    public static Person getInstance() {
        return new Person();
    }

    public static Person getInstance(String name) {
        return new Person(name);
    }

    public static Person getInstance(String name, int age) {return new Person(name, age);}

    public static Person getInstance(Person other) {
        return new Person(other.getName());
    }
}
