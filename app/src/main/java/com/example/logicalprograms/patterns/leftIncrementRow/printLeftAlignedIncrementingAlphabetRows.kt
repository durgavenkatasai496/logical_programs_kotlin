package com.example.logicalprograms.patterns.leftIncrementRow



fun main(){
    printLeftAlignedIncrementingAlphabetRows()
}

fun printLeftAlignedIncrementingAlphabetRows() {

    // Total number of rows in the triangle
    val rows = 5

    // Outer loop controls the number of rows (from 1 to 'rows')
    for (i in 1..rows) {

        // Inner loop controls how many alphabets to print in the current row
        // It runs from 0 to (i - 1), so that each row has one more alphabet than the previous
        for (j in 0 until i) {

            // 'A' is a Char with ASCII value 65
            // Adding 'j' gives next letters: 'A' + 0 = A, 'A' + 1 = B, etc.
            print(" ${'A' + j}")  // Print the alphabet with a space for separation
        }

        // Move to the next line after each row is printed
        println(" ")
    }
}
