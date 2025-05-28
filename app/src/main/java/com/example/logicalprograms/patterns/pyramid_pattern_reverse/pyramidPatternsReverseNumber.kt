package com.example.logicalprograms.patterns.pyramid_pattern_reverse


fun main(){

    pyramidPatternsReverseNumber()
}

fun pyramidPatternsReverseNumber() {

    var numberOfRows = 6

    for (i in numberOfRows downTo 1){

        for (j in 1..(numberOfRows - i)){
            print(" ")
        }

        for (k in 1..i){
            print("$k ")
        }

        println("")

    }
}