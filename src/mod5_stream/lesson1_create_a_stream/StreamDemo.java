package mod5_stream.lesson1_create_a_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    static void main() {


        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 3));
        students.add(new Student("Bob", 20, 3));
        students.add(new Student("Charlie", 20, 4));
        students.add(new Student("David", 20, 3));
        students.add(new Student("Emma", 20, 2));
        students.add(new Student("Frank", 20, 2));
        students.add(new Student("Grace", 20, 3));
        students.add(new Student("Helenna", 20, 1));
        students.add(new Student("Isabella", 20, 3));
        students.add(new Student("Liam", 20, 2));

        //Without streams
//        int count = 0;
//        for (Student student : students) {
//            if (student.getCourse() == 3) count++;
//        }
//        System.out.println("Count of students from 3 course: " + count);

        int cnt = (int) students.stream()
                .filter( student -> student.getCourse() == 3)
                .count();
        System.out.println(cnt);

//        students.stream()
//                .filter(s -> s.getCourse() == 3)
//                .forEach(s -> System.out.println(s));



//        Arrays.stream(students.toArray())
//                .map(element -> (Student) element)
//                .filter(s -> s.getCourse() == 3)
//                .forEach(s -> System.out.println(s));
//
//        Stream.generate(Math::random).forEach(System.out::println);

        Stream.of(4,8,15,16,23,42)
                .map(x -> Math.pow(x, 2))
                .map(x -> Math.round(x))
                .forEach(System.out::println);

    }
}
