package mod2_oop.lesson9_inheritance;

public class Teacher extends Person{
    private String discipline;

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Teacher() {
        super();
    }

    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, String discipline) {
        this(name, age);
        this.discipline = discipline;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + name + "I'm a teacher");
    }
}
