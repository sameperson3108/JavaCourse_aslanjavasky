package mod2_oop.lesson19_comparator

import mod2_oop.lesson19_comparator.GreetingKT

open class PersonKT (
    var name: String,
    var age: Int
) : GreetingKT {

//    init {
//        println("The new object of kotlin class PersonKT")
//    }
    constructor() : this("", 0)
    constructor(name: String) : this(name, 0)


    override fun sayHello() {
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