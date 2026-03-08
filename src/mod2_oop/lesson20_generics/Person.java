package mod2_oop.lesson20_generics;

public class Person<T> {


    private T id; // T - сокращенно от Type, используем, когда не уверены какой тип даннх нужно ставить
    private String name;
    private int age;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
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


    public Person(T id, String name) {
        this.id = id;
        this.name = name;
    }
}
