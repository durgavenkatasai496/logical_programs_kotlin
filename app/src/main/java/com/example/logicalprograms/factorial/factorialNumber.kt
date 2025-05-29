package com.example.logicalprograms.factorial

fun main(){
    factorialNumber()
}

fun factorialNumber(){

    var factorialNumber = 6

    var factorialTotalNumber = 1

    for (i in factorialNumber downTo 1){

        factorialTotalNumber = factorialTotalNumber * i

    }

    println(factorialTotalNumber)
}