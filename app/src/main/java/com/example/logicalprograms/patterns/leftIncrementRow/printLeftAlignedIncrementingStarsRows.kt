package com.example.logicalprograms.patterns.leftIncrementRow




fun printLeftAlignedIncrementingStarsRows() {

    var numberOfRows = 5

    for (i in 1..numberOfRows){
        for (j in 1..i){
            print(" * ")
        }
        println("")
    }
}