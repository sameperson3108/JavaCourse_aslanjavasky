package mod2_oop.lesson14_functional_interface

fun main() {
//    val englishGreeting: (String) -> Unit = { name -> println("Hello, $name")}
//    englishGreeting("solara")

    val englishGreeting:GreetingKT = object : GreetingKT {
        override fun sayHello(name: String) {
            println("Hello, $name!")
        }
    }
    englishGreeting.sayHello("solara")
}