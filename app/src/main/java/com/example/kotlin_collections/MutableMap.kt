package com.example.kotlin_collections

fun main() {

    var mutableMap = mutableMapOf<Int, String>(1 to "Lili", 2 to "Payla", 6 to "Kitty")

    // add elements to maps
    mutableMap.put(4, "New Element")

    // Remove element
    mutableMap.remove(2)

    // Print elements
    for(item in mutableMap.values) {
        println(item)
    }

}