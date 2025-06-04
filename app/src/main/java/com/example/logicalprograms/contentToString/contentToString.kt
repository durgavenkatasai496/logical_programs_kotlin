package com.example.logicalprograms.contentToString

fun main(){
    contentToStringChecking()
}


/*
 * contentToString() is a function that converts an array into a readable string format
 */
fun contentToStringChecking(){

    var arrayList = arrayOf("ONE","TWO","THREE")

    // Print the Memory Address
    println(arrayList)

    println(arrayList.contentToString())

}