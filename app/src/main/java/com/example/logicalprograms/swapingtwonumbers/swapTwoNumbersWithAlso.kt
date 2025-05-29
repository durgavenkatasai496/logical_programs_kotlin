package com.example.logicalprograms.swapingtwonumbers

fun main(){
    swapTwoNumbersWithAlso()
}

fun swapTwoNumbersWithAlso(){

    var one = 10
    var two = 20

    println("BEFORE SWAP NUMBER :$one")
    println("BEFORE SWAP NUMBER : $two")

    one = two.also { two = one }

    println("AFTER SWAP NUMBER : $one")
    println("AFTER SWAP NUMBER : $two")

}