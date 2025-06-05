package com.example.logicalprograms.common_prefix

import androidx.compose.ui.graphics.findFirstRoot


fun main() {

    commonPrefix()

}

fun commonPrefix() {

    /*
     * Step 1: Define an array of strings.
     * These are the words we want to find the common prefix from.
     */
    val arrayNames = arrayOf("Flower", "flow", "flight")

    /*
     * Step 2: Check if the array is empty.
     * If there are no items to compare, return early with a message.
     */
    if (arrayNames.isEmpty()) {
        println("Empty Array Names")
        return
    }

    /*
     * Step 3: Convert all strings to lowercase so comparison is case-insensitive.
     * Example: ["Flower", "flow", "flight"] → ["flower", "flow", "flight"]
     */
    val lowerCaseArray = Array(arrayNames.size) { i -> arrayNames[i].lowercase() }

    /*
     * Step 4: Take the first word from the list as the base for comparison.
     * This will be compared character by character with the rest of the words.
     * Example: firstWord = "flower"
     */
    val firstWord = lowerCaseArray[0]

    /*
     * Step 5: Initialize an empty string to store the common prefix characters.
     */
    var commonPrefix = ""

    /*
     * Step 6: Loop through each character index of the first word.
     * Example: Indices of "flower" = 0 to 5 (f, l, o, w, e, r)
     */
    for (i in firstWord.indices) {

        /*
         * Step 7: Get the current character from the first word.
         * This is the character we'll compare with the same position in other words.
         * Example: currentChar = 'f' for i = 0
         */
        val currentChar = firstWord[i]

        /*
         * Step 8: Loop through the remaining words in the array (starting from index 1).
         * We skip index 0 since it's the firstWord itself.
         */
        for (j in 1 until lowerCaseArray.size) {

            /*
             * Step 9: Get the current word to compare with.
             * Example: lowerCaseArray[1] = "flow", lowerCaseArray[2] = "flight"
             */
            val word = lowerCaseArray[j]

            /*
             * Step 10: Check two things:
             *  1. If the current index `i` exceeds the length of this word → it's shorter than firstWord.
             *  2. If the character at index `i` does NOT match the `currentChar`.
             *
             * If either condition is true, we've found the end of the common prefix.
             */
            if (i >= word.length || word[i] != currentChar) {
                println("Common Prefix: $commonPrefix")
                return
            }
        }

        /*
         * Step 11: If all words have the same character at this index,
         * add it to the common prefix.
         */
        commonPrefix += currentChar
    }

    /*
     * Step 12: If loop completes without returning, all characters matched.
     * Print the full common prefix.
     */
    println("Common Prefix: $commonPrefix")
}
