package com.example.logicalprograms.patterns.leftIncrementRow





fun printLeftAlignedIncrementingNumberRows() {

    val numberOfRows = 5 // Total number of rows in the triangle

    // Outer loop controls the number of rows
    // For i from 1 to startNumber (inclusive), a new row is created each time
    for (i in 1..numberOfRows) {

        // Inner loop prints numbers from 1 up to the current value of 'i'
        // So, in row 1: it prints 1
        // In row 2: it prints 1 2
        // In row 3: it prints 1 2 3, and so on...
        for (j in 1..i) {
            print(" $j ") // Print the number followed by a space
        }

        // After printing one full row, move to the next line
        println()
    }
}
