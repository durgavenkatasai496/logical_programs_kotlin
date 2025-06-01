package com.example.logicalprograms.palindrome


fun main(){
    palindromeString()
}

fun palindromeString() {


    var nameString = "MADAM"

    var reverseString = ""


    /*
     * Flow : 4 down to 0
     * Step 1 : index = 4 :
     */
    for (i in nameString.lastIndex downTo 0){
        /*
         * Step 1 : reverseString = reverseString + reverseString[4] =M
         */
        reverseString = reverseString + nameString[i]
    }

    if (nameString == reverseString){
        println("Palindrome Number : $reverseString")
    } else {
        println("Not Palindrome Number : $reverseString")
    }

}