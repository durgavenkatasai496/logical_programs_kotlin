package com.example.logicalprograms.largestNumberInarray



fun main(){
    findTheThirdLargestNumberArray()
}


fun findTheThirdLargestNumberArray(){

    var arrayList = arrayOf(1,11,99,88,22,77,66)
    var firstLargestNumber = 0
    var secondLargestNumber = 0
    var thirdLargestNumber = 0

    for (i in arrayList){
        if (i > firstLargestNumber){
            thirdLargestNumber = secondLargestNumber
            secondLargestNumber = firstLargestNumber
            firstLargestNumber = i
        } else if (i > secondLargestNumber && i != firstLargestNumber){
            thirdLargestNumber = secondLargestNumber
            secondLargestNumber = i
        }else if (i > thirdLargestNumber && i != secondLargestNumber && i != firstLargestNumber) {
            thirdLargestNumber = i
        }
    }

    println("FIRST LARGEST NUMBER : $firstLargestNumber")
    println("SECOND LARGEST NUMBER : $secondLargestNumber")
    println("THIRD LARGEST NUMBER : $thirdLargestNumber")

}