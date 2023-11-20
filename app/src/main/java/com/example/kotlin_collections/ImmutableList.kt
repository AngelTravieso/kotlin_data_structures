package com.example.kotlin_collections

fun main() {

    // List: Ordered Collection in which we can access elements by using indices that define a position for each element

    // Immutable list
    val list1 = listOf<Int>(4,6,3,7,5,2)
    val list2 = listOf("Jack", "Jhon", "Mike")

    for(item in list1) {
        println(item)
    }

    for(item in list2) {
        println(item)
    }

}