package mod1_syntax.lesson20_unit

fun main() {
    var multiply:(Int, Int) -> Unit = {a, b -> println(a * b)}

    multiply(3,6)
}