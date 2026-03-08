package mod2_oop.lesson13_interface

class StudentKT:PersonKT {

    var course:Int = 0

    constructor():super()
    constructor(name: String):super(name)
    constructor(name: String,age: Int, course: Int):super(name, age) {
        this.course = course
    }

    override fun sayHello() {
        println("Hello, my name is $name. I'm a student")
    }

    companion object {
        fun getInstance(): StudentKT {
            return StudentKT()
        }
        fun getInstance(name: String) = StudentKT(name)
    }

}