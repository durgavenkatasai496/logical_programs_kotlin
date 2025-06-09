package com.example.logicalprograms.numberOfDuplicatesArray


fun main(){
    numberOfDuplicatesArray()
}

fun numberOfDuplicatesArray(){

    val arrayList = arrayOf(1,2,3,3,4,5,6)

    val countNumber = mutableMapOf<Int, Int>()

    for (i in arrayList){

        if (countNumber.contains(i)){
            countNumber[i] = countNumber[i]!! + 1
        } else {
            countNumber[i] = 1
        }
    }

    for (duplicates in countNumber){

        if (duplicates.value > 1){
            print("${duplicates.value} is duplicates Name : ${duplicates.key}")
        }
    }



}