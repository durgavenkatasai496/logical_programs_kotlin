package com.example.logicalprograms.mergeTwoSortedList

fun main(){

    mergeTwoSortedList()
}

// Sorted() : means small to high number
// Example : 1,2,3,4,
fun mergeTwoSortedList(){

    var listOne = listOf(9,2,4)
    var listTwo = listOf(1,3,4)

    var merged = (listOne + listTwo).sorted()

    print(merged)



}