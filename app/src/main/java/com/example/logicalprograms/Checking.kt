package com.example.logicalprograms



fun main() {
    challenge()
}

fun challenge() {

    //aabBcde11 : "a:2, b:2, 1:2"


    var inputSting = "aabBcde11"

    var mutableCount = mutableMapOf<Char, Int>()

    var lowerCaseConveret = inputSting.lowercase()

    for (i in lowerCaseConveret){

        if (mutableCount.contains(i)){
            mutableCount[i] = mutableCount[i]!! + 1
        } else {
            mutableCount[i] = 1
        }
    }


    print(mutableCount)
}

