package com.example.logicalprograms.patterns.pyramid_pattern_reverse



fun main(){
    pyramidPatternsReverseAlphabets()
}

fun pyramidPatternsReverseAlphabets() {

    var numberOfRows = 7

    for (i in numberOfRows downTo 1){

        for (j in 1..(numberOfRows - i)){
            print(" ")
        }

        for (k in 0 until i){

            print(" ${ 'A' + k}")

        }



        println()

    }
}