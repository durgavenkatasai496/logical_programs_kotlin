package com.example.logicalprograms.singleNumber

fun main() {
//    singleNumber()
    singleNumberXor()
}

fun singleNumber() {
    val singleNumberFind = listOf(2,2,3,4,3,1)

    for (i in singleNumberFind.indices) {
        var count = 0

        for (j in singleNumberFind.indices) {

            if (i != j && singleNumberFind[i] == singleNumberFind[j]) {
                count++
            }
        }

        if (count == 0) {
            println("Single number is: ${singleNumberFind[i]}")
        }
    }
}


fun singleNumberXor(){
    var singleNumberFind = listOf(1,2,2)

    var result = 0


    for (i in singleNumberFind){


        result = result xor i
    }

    print(result)
}
