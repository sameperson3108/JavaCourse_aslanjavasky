package syntax.lesson14_Scanner

import java.util.Scanner

fun main() {

    var scanner: Scanner = Scanner(System.`in`)

    print("Enter your name: ")

    val name = scanner.nextLine()

    print("Enter your age: ")

    val age = scanner.nextInt()

    println("My name is $name and I'm $age years old")

    scanner.close()
}