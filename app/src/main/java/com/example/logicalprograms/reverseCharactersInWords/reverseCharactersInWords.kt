package com.example.logicalprograms.reverseCharactersInWords

fun main(){
    reverseCharactersInWords()
}

fun reverseCharactersInWords(){
    val sentence = "This is Kotlin"
    val reversedWords = sentence.split(" ").map { it.reversed() }
    val removeTheComa = reversedWords.joinToString(" ")
    println(removeTheComa)
}