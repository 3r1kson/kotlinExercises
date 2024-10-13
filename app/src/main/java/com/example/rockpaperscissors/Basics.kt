package com.example.rockpaperscissors

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int)

fun main() {

//    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card", "SSD")

    shoppingList.add("Keyboard")

    println(shoppingList)

    shoppingList.removeAt(0)

    println(shoppingList.contains("RAM"))

    for(i in shoppingList) {
        println(i)
        if(i == "RAM") {
            shoppingList.removeLast()
            break
        }
    }

    println(shoppingList)

}


//fun main() {
//
//    val coffeForDenis = CoffeeDetails(1, "Denis", "xxl", 2)
//
//    makeCoffee(coffeForDenis)
//
////    var daisy = Dog("Daisy", "Dwarf poodle", 1)
//
////    println("${daisy.name} is ${daisy.breed} and is ${daisy.age} yo")
//
////    println("Insert the first number")
////    var number1 = readln().toInt()
////    var num1 = number1.toDouble()
////    println("Insert the second number")
////    var number2 = readln().toInt()
////    var num2 = number2.toDouble()
////    val myResult = add(number1, number2)
////    println(myResult)
////
////    var division = divide(num1, num2)
////    println("The division is $division")
//}

fun add(num: Int, num2: Int): Int {
    // var result = add(num, num2)
    var result = num + num2

    return result
}

fun divide(num: Double, num2: Double): Double {
    return (num/num2)
}

fun askCoffeeDetails() {
    println("Who's the coffee for?")
    var name = readln()
    println("How many pieces of sugar?")
    var sugarCount = readln()
    var sugarCountInt = sugarCount.toInt()
//    makeCoffee(sugarCountInt, name)
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if(coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} " +
        "spoon of sugar for ${coffeeDetails.name} + " +
        "${coffeeDetails.creamAmount} amount of cream")
    } else if(coffeeDetails.sugarCount == 0) {
        println("Coffee with no sugar for ${coffeeDetails.name}")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} " +
        "spoons of sugar for ${coffeeDetails.name}")
    }
}