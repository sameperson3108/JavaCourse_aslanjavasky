package mod1_syntax.lesson21_practise

fun main() {
    println("The winner is ${getWinner(4, 3, 5, 2)}")
}

fun getWinner(a: Int, b: Int, c: Int, d: Int): String {
    if (a > b && b > c && a > d) return "a"
    else if (b > a && b > c && b > d) return "b"
    else if (c > a && c > b && c > d) return "c"
    else return "d"
}