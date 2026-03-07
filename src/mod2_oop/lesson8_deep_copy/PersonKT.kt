package mod2_oop.lesson8_deep_copy

class PersonKT constructor(
    var name: String,
    var age: Int
) {

    init {
        println("The new object of kotlin class PersonKT")
    }
    constructor() : this("", 0)
    constructor(name: String) : this(name, 0)

    fun sayHello() {
        println("Hello, my name is $name")
    }

    companion object {
        const val KIND = "Human"

        fun getInstance(): PersonKT {
            return PersonKT()
        }

        fun getInstance(name: String) = PersonKT(name)
    }
}