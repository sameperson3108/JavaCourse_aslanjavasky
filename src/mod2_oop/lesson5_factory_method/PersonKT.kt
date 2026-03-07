package mod2_oop.lesson5_factory_method

class PersonKT constructor(
    var name: String,
    var age: Int
) {

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