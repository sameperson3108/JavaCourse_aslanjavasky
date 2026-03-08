package mod2_oop.lesson20_generics

data class PersonKT<T> (
    var name: String,
    var age: Int,
    var id: T?
) {

    constructor() : this("", 0, null)
    constructor(name: String) : this(name, 0, null)

    fun sayHello() {
        println("Hello, my name is $name")
    }
}