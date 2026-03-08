package mod2_oop.lesson21_extensions

fun main() {

    val name = "solara"
    println(name.razvernyt())

    println("The number 11 is even? answer:${11.isEven()}")
    println("The number 32 is even? answer:${32.isEven()}")

    val repeat = "repeat"
    println(repeat.povtori(5))

}
//extensions
fun String.razvernyt() = this.reversed()
fun Int.isEven() = this % 2 == 0
fun String.povtori(count: Int) = this.repeat(count)
