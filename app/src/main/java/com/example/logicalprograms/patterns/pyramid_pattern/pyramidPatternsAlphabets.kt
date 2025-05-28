package com.example.logicalprograms.patterns.pyramid_pattern




fun pyramidPatternsAlphabets() {

    var numberOfRows = 5

    for (i in 1..numberOfRows){

        for (j in 1..(numberOfRows - i)){
            print(" ")
        }

        for (k in 0 until i){
            print(" ${'A' + k}")
        }

        println()

    }
}