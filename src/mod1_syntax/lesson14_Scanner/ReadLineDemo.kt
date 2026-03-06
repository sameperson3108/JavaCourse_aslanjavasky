package mod1_syntax.lesson14_Scanner

fun main() {

    print("Enter your name: ")

    val name = readLine()

    print("Enter your age: ")

    val age:Int = readLine()?.toIntOrNull() ?: 0

    println("My name is $name and I'm $age years old")
}