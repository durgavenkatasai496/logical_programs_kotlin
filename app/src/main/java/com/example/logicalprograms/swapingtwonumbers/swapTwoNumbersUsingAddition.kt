package com.example.logicalprograms.swapingtwonumbers

fun main(){
    swapTwoNumbersUsingAddition()
}

fun swapTwoNumbersUsingAddition(){

    //Swapping With Additional

    var one = 2
    var two = 3

    println("BEFORE SWAPPING NUMBERS : $one")
    println("BEFORE SWAPPING NUMBERS : $two")


    one = one + two
    two = one - two
    one = one - two


    println("AFTER SWAPPING NUMBERS : $one")
    println("AFTER SWAPPING NUMBERS : $two")

}