package com.example.logicalprograms.patterns.leftDecrementRow



fun main(){
    leftAlignedDecrementNumber()
}

fun leftAlignedDecrementNumber() {


    var numberOfRows = 7

    for (i in numberOfRows downTo 1){

        for (j in 1..i){

            print(" $j ")

        }

        println()
    }

}