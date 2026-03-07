package mod2_oop.lesson4_static

class PersonKT constructor(
    var name: String,
    var age: Int
) {

    constructor() : this("", 0)

    fun sayHello() {
        println("Hello, my name is $name")
    }

    companion object {
        const val KIND = "Human"
    }
}