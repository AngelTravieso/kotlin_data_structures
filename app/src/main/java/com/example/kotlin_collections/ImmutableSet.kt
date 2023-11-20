package com.example.kotlin_collections

fun main() {

    // Set: It's a collection of unordered unique elements
    // It's a collection of unique elements (No duplicate elements)

    // Generally, the order of set elements does not have a significant effect.
    // We can not perform add or remove operations because it's a immutable set.

    // Immutable set
    var immutableSet = setOf(2,4,63,2,56,2, "Hello", 0,0, 3)

    for(item in immutableSet) {
        println(item)
    }

}