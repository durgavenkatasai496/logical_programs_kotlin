package com.example.logicalprograms

import kotlinx.coroutines.joinAll


fun main(){
    rowsChecking()
}

fun rowsChecking(){

    var rows = 5


    for (i in rows downTo 1){

        for (j in 1..(rows - i)){
            print(" ")
        }

        for (k in 1..i){
            print("* ")
        }

        println("")

    }





}