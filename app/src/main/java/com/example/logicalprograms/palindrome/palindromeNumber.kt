package com.example.logicalprograms.palindrome


fun main(){
    palindromeNumber()
}

fun palindromeNumber() {

    // Step 0: Initialize the number to check
    var number = 121

    // Step 0: Store the original number in a temporary variable for comparison later
    var tempVariable = number

    // Step 0: This variable will store the reversed number
    var reverseNumber = 0

    // Loop runs until number becomes 0
    while (number > 0) {

        // Get the last digit of the current number using modulo
        // For example: if number = 121, then 121 % 10 = 1
        val lastDigit = number % 10

        // Append the last digit to reverseNumber
        // For example: reverseNumber = 0 → 0 * 10 + 1 = 1
        // Next: reverseNumber = 1 → 1 * 10 + 2 = 12, and so on
        reverseNumber = reverseNumber * 10 + lastDigit

        // Remove the last digit from number by dividing it by 10
        // For example: 121 / 10 = 12, 12 / 10 = 1, 1 / 10 = 0
        number = number / 10
    }

    // After the loop, reverseNumber contains the reversed digits of the original number
    // Compare it with the original number (stored in tempVariable)
    if (tempVariable == reverseNumber) {
        // If both are same, it's a palindrome
        println("PALINDROME NUMBER CHECKING : $reverseNumber")
    } else {
        // If not same, it's not a palindrome
        println("NOT PALINDROME NUMBER CHECKING : $reverseNumber")
    }
}
