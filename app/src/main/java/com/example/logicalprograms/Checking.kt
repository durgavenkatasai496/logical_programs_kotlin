package com.example.logicalprograms



fun main() {
    challenge()
}

fun challenge() {


    var textChecking = "This is Kotlin"

    val result = textChecking.split(" ").map { it.reversed() }.joinToString(",")

    println(result)


}

