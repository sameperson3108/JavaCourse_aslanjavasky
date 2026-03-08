package mod2_oop.lesson17_inner_class

fun main() {
    val outerClass:OuterKtClass = OuterKtClass()
    outerClass.outerMethod()

    val innerClass = outerClass.InnerClass()
    innerClass.innerMethod()
}