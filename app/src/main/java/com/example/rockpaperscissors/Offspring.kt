package com.example.rockpaperscissors

class Offspring: Secondary(), Archery, Singer {
    override fun archery() {
        super.archery()
        println("Archery skill enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanched by Offspring")
    }
}