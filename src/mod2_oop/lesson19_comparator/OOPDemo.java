package mod2_oop.lesson19_comparator;

import mod2_oop.lesson19_comparator.Person;
import mod2_oop.lesson19_comparator.Student;
import mod2_oop.lesson19_comparator.StudentKT;

public class OOPDemo {
    static void main() {

        //Comparable - прикладывает метод к конкретной инстанции

//        Integer int1 = 10;
//        Integer int2 = 16;
//        Integer int3 = 16;
//
//        System.out.println(int1.compareTo(int2)); //-1
//        System.out.println(int2.compareTo(int1)); //1
//        System.out.println(int3.compareTo(int2)); //0

//        var student1 = Student.getInstance("solara", 20, 4);
//        var student2 = Student.getInstance("John", 21, 2);
//
//        System.out.println(student1.compareTo(student2));

        //Comparator - принимает 2 объекта

        var student1 = Student.getInstance("solara", 20, 4);
        var student2 = Student.getInstance("John", 21, 2);

        System.out.println(student1.compare(student1, student2));


    }
}
