package com.example.kotlin_collections

fun main() {
    // A Map is ab object that map keys to values.

    // Immutable map
    var immutableMap = mapOf(1 to "Jack", 2 to "Jhon", 9 to "Jacky")

    println(immutableMap[2])

    // Print map values
    for(item in immutableMap.keys) {
        println(immutableMap[item])
    }

}