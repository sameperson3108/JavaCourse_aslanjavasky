package mod1_syntax.lesson19_functions

fun main() {
    println("The sum of first 10 numbers ${getSumOfNumbers(10)}")
    println("The sum of 10 and 20 numbers ${getSumOfTwoNubmers(10,20)}")
}

fun getSumOfNumbers(number: Int = 1): Int {

    var count = 0
    var sum = 0
    while (count <= number) {
        sum += count
        count++
    }

    return sum
}

fun getSumOfTwoNubmers(a: Int, b: Int): Long {
    return (a + b).toLong()
}