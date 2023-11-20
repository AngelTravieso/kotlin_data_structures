package com.example.kotlin_collections

fun main() {

    // Mutable list: supports both read and write functionalities
    var mutList = mutableListOf("Jack", "Jhon", "Mike")

    // Modifiying the elements
    mutList[2] = "Paul"

    println(mutList[2])

    // Adding elements
    mutList.add("Roey")

    // Read all elements of list
    for(item in mutList) {
        println(item)
    }

}