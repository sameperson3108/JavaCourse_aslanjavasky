package mod4_collections.lesson1_list

fun main() {
    val names = mutableListOf("solara", "sansara")

    names.add(0, "suzan")

    println("The first element is ${names.get(0)}")

    names.removeIf { str -> str.endsWith("n") }

    println(names)


}