package mod3_exception.lesson4_runCatching

fun main() {

    runCatching {
        val arr = arrayOf(4, 6, 15, 34, 2, 4)
        arr[5]
    }.onSuccess { it ->
        println("Result: $it")
    }.onFailure {
        println("Exception: $it")
    }

}