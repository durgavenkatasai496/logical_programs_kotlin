package com.example.logicalprograms.patterns.pyramid_pattern


fun main(){

    pyramidPatternNumber()

}

fun pyramidPatternNumber() {

    var numberOfRows = 5

    for (i in 1..numberOfRows){

        for (j in 1..(numberOfRows - i)){
            print(" ")
        }

        for (k in 1..i){
            print("$k ")
        }

        println("")
    }
}