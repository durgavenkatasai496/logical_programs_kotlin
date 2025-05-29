package com.example.logicalprograms.swapingtwonumbers


fun main(){

    swapTwoNumbersWithTemp()
}

fun swapTwoNumbersWithTemp(){

    var one = 10
    var two = 20

    println("BEFORE SWAP NUMBERS : $one")
    println("BEFORE SWAP NUMBERS :$two")

    var temp = one
    one = two
    two = temp


    println("AFTER SWAP NUMBERS : $one")
    println("AFTER SWAP NUMBERS :$two")

}