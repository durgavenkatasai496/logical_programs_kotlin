package com.example.logicalprograms.swapingtwonumbers


fun main(){
    swapTwoNumberWithMultiplication()
}

fun swapTwoNumberWithMultiplication(){


    var one = 10
    var two = 20

    println("BEFORE SWAP NUMBER :$one")
    println("BEFORE SWAP NUMBER :$two")

    one = one * two
    two = one / two
    one = one / two

    println("AFTER SWAP NUMBER :$one")
    println("AFTER SWAP NUMBER :$two")

}