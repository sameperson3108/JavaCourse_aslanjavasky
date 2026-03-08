package mod2_oop.lesson19_comparator

fun main() {
    val harry = StudentKT("Harry Potter", 15, 4)
    val solara = StudentKT("Solar Potter", 23, 1)

    println(harry.compareTo(solara))

    val studentComparator:Comparator<Student> = Comparator<Student> {s1, s2 ->
        s1.compareTo(s2)
    }
}