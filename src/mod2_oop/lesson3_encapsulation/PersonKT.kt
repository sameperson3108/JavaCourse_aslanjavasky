package mod2_oop.lesson3_encapsulation

class PersonKT constructor() {
    var name : String = ""
    var age : Int = 0

    constructor(name: String, age: Int):this() {
        this.name = name
        this.age = age
    }

    fun sayHello() {
        println("Hello, my name is $name")
    }
}