package mod4_collections.lesson3_set

fun main() {

    val names = mutableListOf("Anton", "Anton", "sameperson", "Petr", "john", "sveta", "zoltan")
    println("list of names: $names")

    val setOfNames = names.toSet()
    println("set of names: $setOfNames")

    val sortedSetOfNames = setOfNames.toSortedSet()
    println("sorted set of names: $sortedSetOfNames")

}