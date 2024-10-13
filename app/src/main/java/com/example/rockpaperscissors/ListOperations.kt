package com.example.rockpaperscissors

fun main() {

    val fruitsList = mutableListOf("banana", "apple", "avocado", "grapefruit", "grapes")

    fruitsList.add("blueberry")

    println(fruitsList)

    fruitsList.remove("grapes")

    println(fruitsList.contains("banana"))
}