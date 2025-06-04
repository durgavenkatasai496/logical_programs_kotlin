package com.example.logicalprograms.common_prefix

import androidx.compose.ui.graphics.findFirstRoot


fun main() {

    commonPrefix()

}

fun commonPrefix() {
    val arrayNames = arrayOf("Flower", "flow", "flight")

    /*
     * When First Time Execute the if arrayNames List is empty these execute
     */
    if (arrayNames.isEmpty()) {
        println("Empty Array Names")
        return
    }

    val lowerCaseArray = Array(arrayNames.size) { i -> arrayNames[i].lowercase() }

    val firstWord = lowerCaseArray[0]
    var commonPrefix = ""

    for (i in firstWord.indices) {
        val currentChar = firstWord[i]

        for (j in 1 until lowerCaseArray.size) {
            val word = lowerCaseArray[j]

            if (i >= word.length || word[i] != currentChar) {
                println("Common Prefix: $commonPrefix")
                return
            }
        }

        commonPrefix += currentChar
    }

    println("Common Prefix: $commonPrefix")
}
