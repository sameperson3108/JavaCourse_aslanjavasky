package mod1_syntax.lesson22_switch_when

fun getWinner(a: Int, b:Int, c:Int, d:Int) {

    var maxPoints = maxOf(a, b, c, d)

    when (maxPoints) {
        a -> println("a")
        b -> println("b")
        c -> println("c")
        d -> println("d")
    }

}