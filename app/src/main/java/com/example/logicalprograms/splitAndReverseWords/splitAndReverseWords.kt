package com.example.logicalprograms.splitAndReverseWords

fun main(){

    splitAndReverseWords()
}

fun splitAndReverseWords(){

    var inputSting = "Hello World"

    var splitReverse = inputSting.split(" ").reversed()

    println(splitReverse)

}