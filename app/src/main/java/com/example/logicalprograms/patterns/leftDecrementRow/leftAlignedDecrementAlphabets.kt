package com.example.logicalprograms.patterns.leftDecrementRow


fun main(){
    leftAlignedDecrementAlphabets()
}

fun leftAlignedDecrementAlphabets() {

    var numberOfRows = 7

    for (i in numberOfRows downTo 1){

        for (j in 0 until  i){

            print(" ${'A' + j} ")
        }

        println()

    }
}