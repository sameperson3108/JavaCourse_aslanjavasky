package mod5_stream.lesson2_stream_function;

import mod5_stream.lesson1_create_a_stream.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    static void main() {


        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 3));
        students.add(new Student("Bob", 20, 3));
        students.add(new Student("Charlie", 21, 4));
        students.add(new Student("Helenna", 23, 1));
        students.add(new Student("Isabella", 19, 3));
        students.add(new Student("Liam", 20, 2));
        students.add(new Student("David", 20, 3));
        students.add(new Student("Emma", 22, 2));
        students.add(new Student("Frank", 20, 2));
        students.add(new Student("Grace", 18, 3));


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

        //Студенты старше 20 лет
        List<Student> studentsOlder20 = students.stream()
                .filter(student -> student.getAge() >= 21)
                .toList();
        System.out.println(studentsOlder20);

        //вывод имён студентов
        List<String> studentsNames = students.stream()
                .map(Student::getName)
                .toList();
        System.out.println(studentsNames);

        //сортировка по именам
        List<Student> sortedByNames = students.stream()
                .sorted((student1, student2) -> student1.getName().compareTo(student2.getName()))
                .toList();
        System.out.println(sortedByNames);

        //сортировка по возрасту
//        List<Student> sortedByAge = students.stream()
//                .sorted((student1, student2) -> student1.getAge().compareTo(student2.getAge()))
//                .toList();
//        System.out.println(sortedByAge);

        //достать первого студента с 3 курса
        Student firstStudentFrom3Coure = students.stream()
                .filter(student -> student.getCourse() == 3)
                .findFirst()
                .orElse(null);
        System.out.println(firstStudentFrom3Coure);

        //сумма лет всех студентов
        int totalAge = students.stream()
                .mapToInt(Student::getAge)
                .sum();
        System.out.println("Total age: " + totalAge);

        //вычислить средний возраст всех студентов
        double avgAge = students.stream()
                .mapToDouble(Student::getAge)
                .average()
                .orElse(0);
        System.out.println("The average age " + avgAge);

//        students.stream()
//                .filter(s -> s.getCourse() == 3)
//                .forEach(s -> System.out.println(s));



//        Arrays.stream(students.toArray())
//                .map(element -> (Student) element)
//                .filter(s -> s.getCourse() == 3)
//                .forEach(s -> System.out.println(s));
//
//        Stream.generate(Math::random).forEach(System.out::println);

//        Stream.of(4,8,15,16,23,42)
//                .map(x -> Math.pow(x, 2))
//                .map(x -> Math.round(x))
//                .forEach(System.out::println);

    }
}
