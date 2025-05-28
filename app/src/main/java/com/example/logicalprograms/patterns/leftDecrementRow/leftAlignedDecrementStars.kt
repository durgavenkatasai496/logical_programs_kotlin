package com.example.logicalprograms.patterns.leftDecrementRow

fun main(){

    leftAlignedDecrementStars()

}

fun leftAlignedDecrementStars() {

    var numberOfRows = 7

    for (i in numberOfRows downTo 1){

        for( j in 1..i){
            print(" * ")
        }

        println("")


    }
}