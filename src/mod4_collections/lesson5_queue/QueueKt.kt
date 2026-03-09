package mod4_collections.lesson5_queue

import java.util.PriorityQueue

fun main() {
    val queueName = PriorityQueue<String>()
    queueName.add("Alice")
    queueName.offer("Bob")
    queueName.add("Carol")
    queueName.add("Dan")

    println(queueName)
    queueName.poll()
    println(queueName)
}