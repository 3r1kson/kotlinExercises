package com.example.rockpaperscissors

// Derived class of baseClass
open class Secondary: BaseClass() {
    override fun role() {
        super.role()

        println("Knight of the House of BaseClass")
    }
}