package mod2_oop.lesson9_inheritance;

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

    public static StudentKT getInstance() {
        return new StudentKT();
    }

    public static StudentKT getInstance(String name) {
        return new StudentKT(name);
    }

    public static StudentKT getInstance(Person other) {
        return new StudentKT(other.getName());
    }


}
