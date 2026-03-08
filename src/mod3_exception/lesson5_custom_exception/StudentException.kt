package mod3_exception.lesson5_custom_exception

class StudentException : Exception {
    constructor(): super()
    constructor(message: String): super(message)
}