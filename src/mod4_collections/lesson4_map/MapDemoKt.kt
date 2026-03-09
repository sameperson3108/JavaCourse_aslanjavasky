package mod4_collections.lesson4_map

fun main() {
    val mapOfPeople = mutableMapOf<String, Int>()
    mapOfPeople["solara"] = 20
    mapOfPeople.put("sun", 10)
    mapOfPeople["petr"] = 15

    println(mapOfPeople)

//    for ((name, age) in mapOfPeople) {
//        println("$name = $age")
//    }

    mapOfPeople.forEach { name, age ->
        println("$name = $age")
    }
}