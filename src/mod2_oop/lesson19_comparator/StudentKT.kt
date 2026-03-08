package mod2_oop.lesson19_comparator

class StudentKT:PersonKT, Comparable<StudentKT>  {

    var course:Int = 0

    constructor():super()
    constructor(name: String):super(name)
    constructor(name: String,age: Int, course: Int):super(name, age) {
        this.course = course
    }

    override fun sayHello() {
        println("Hello, my name is $name. I'm a student")
    }

    override fun compareTo(other: StudentKT): Int {
         return if (this.age > other.age) {
             1
        } else if (this.age < other.age) {
            -1
        } else {
            0
        }
    }

    companion object {
        fun getInstance(): StudentKT {
            return StudentKT()
        }
        fun getInstance(name: String) = StudentKT(name)
    }

}