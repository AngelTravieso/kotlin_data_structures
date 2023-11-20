package com.example.kotlin_collections

fun main() {

    // Mutable set
    var mutableSet = mutableSetOf<Int>(1,2,5,3,3)

    // Adding elements to set
    mutableSet.add(4)

    // Print the elements in set
    for(item in mutableSet) {
        println(item)
    }

    println("-------------------")

    // Remove element
    mutableSet.remove(3)

    for(item in mutableSet) {
        println(item)
    }

}