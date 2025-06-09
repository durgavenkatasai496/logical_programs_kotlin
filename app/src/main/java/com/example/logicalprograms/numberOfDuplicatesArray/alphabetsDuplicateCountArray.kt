package com.example.logicalprograms.numberOfDuplicatesArray

fun main(){
    alphabetsDuplicatesCountArray()
}

fun alphabetsDuplicatesCountArray(){

    /*
     * Step 1 : inputString = ABCDA
     */
    var inputString = "ABCDA"

    /*
     * Step 2 : countMap = empty
     */
    var countMap = mutableMapOf<Char, Int>()


    /*
     * Step 3 : items : A B C D A
     */
    for (ch in inputString){
        /*
         * Step 4 : checking first is empty : fail
         *
         * Step 8 : true : going to inside the if condition :
         * particular index increase the value
         */
        if (countMap.contains(ch)){
           //countMap[ch] = countMap[ch]!! + 1 = increase the count.
            countMap[ch] = countMap[ch]!! + 1
        }
        /*
         * Step 4 : Continue Character base = value increase
         * Step 5 : value increase
         * Step 6 : value increase
         * Step 7 : Value increase
         *
         */
        else {
            countMap[ch] = 1
        }
    }

    println(countMap)

}