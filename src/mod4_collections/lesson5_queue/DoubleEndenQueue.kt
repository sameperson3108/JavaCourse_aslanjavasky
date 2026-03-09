package mod4_collections.lesson5_queue

import java.util.*

fun main() {
    val deque: Deque<String> = ArrayDeque<String>()
    deque.addFirst("Alice")
    deque.addLast("Bob")
    deque.addLast("Charlie")

    println(deque)

    val firstName = deque.removeFirst()
    val lastName = deque.removeLast()

    println("First element: " + firstName)
    println("Last element: " + lastName)
    println(deque)

    val first = deque.getFirst()
    val last = deque.getLast()

    println("first = " + first)
    println("last = " + last)
}