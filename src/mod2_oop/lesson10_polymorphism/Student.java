package mod2_oop.lesson10_polymorphism;

import mod2_oop.lesson10_polymorphism.Person;

public class Student extends Person {
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student() {
        super();
    }

    public Student(String name) {
        super(name);
    }

    public Student(int age, String name) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " I'm a student.");
    }

    public static Student getInstance() {
        return new Student();
    }

    public static Student getInstance(String name) {
        return new Student(name);
    }

    public static Student getInstance(Person other) {
        return new Student(other.getName());
    }


}
