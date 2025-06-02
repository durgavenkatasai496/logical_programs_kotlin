package com.example.logicalprograms.romantointeger


fun main() {
    val roman = "IV"
    val result = romanToInteger(roman)
    println("The integer value of $roman is $result")
}

fun romanToInteger(roman: String): Int {
    var total = 0
    var previousValue = 0

    /*
     * Step 1: Start loop from the last index to the first
     * Example: roman = "IV" → indices = 1 (V), 0 (I)
     */
    for (i in roman.length - 1 downTo 0) {
        // Current character from end to start
        /*
         * Step 1: i = 1 → currentChar = V
         * Step 2: i = 0 → currentChar = I
         */
        val currentChar = roman[i]
        var currentValue = 0

        // Convert Roman character to its numeric value
        /*
         * Step 1: currentChar = 'V' → currentValue = 5
         * Step 2: currentChar = 'I' → currentValue = 1
         */
        when (currentChar) {
            'I' -> currentValue = 1
            'V' -> currentValue = 5
            'X' -> currentValue = 10
            'L' -> currentValue = 50
            'C' -> currentValue = 100
            'D' -> currentValue = 500
            'M' -> currentValue = 1000
        }

        /*
         * Apply logic:
         *
         * Step 1:
         *   currentValue = 5, previousValue = 0 → 5 < 0 → false → go to else → total = 0 + 5 = 5
         *
         * Step 2:
         *   currentValue = 1, previousValue = 5 → 1 < 5 → true → total = 5 - 1 = 4
         */
        if (currentValue < previousValue) {
            /*
             * Step 2: Subtract currentValue from total → total = 5 - 1 = 4
             */
            total -= currentValue
        } else {
            /*
             * Step 1: Add currentValue to total → total = 0 + 5 = 5
             */
            total += currentValue
        }

        /*
         * Update previousValue for next iteration
         *
         * Step 1: previousValue = 5
         * Step 2: previousValue = 1
         */
        previousValue = currentValue
    }

    return total
}
