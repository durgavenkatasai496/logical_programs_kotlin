package com.example.logicalprograms.validParentheses

fun main() {
    val booleanValueChecking = validParentheses("(){}")

    println(booleanValueChecking)
}

fun validParentheses(input: String): Boolean {

    /*
     * Step 1:
     * Create an empty stack to track opening brackets
     */
    val stack = mutableListOf<Char>()

    /*
     * Step 2:
     * Define matching pairs using a Map
     * Closing bracket -> Corresponding opening bracket
     */
    val bracketMap = mapOf(')' to '(', ']' to '[', '}' to '{')

    /*
     * Step 3:
     * Iterate through each character in the input string
     */
    for (char in input) {

        /*
         * Step 4:
         * If current char is an opening bracket, push to stack
         */
        if (char == '(' || char == '[' || char == '{') {
            stack.add(char) // Push to stack
        }

        /*
         * Step 5:
         * If current char is a closing bracket
         */
        else if (char == ')' || char == ']' || char == '}') {

            /*
             * Check if stack is empty or top doesn't match
             * the corresponding opening bracket
             */
            if (stack.isEmpty()) return false

            val top = stack.removeAt(stack.size - 1) // Pop from stack

            if (top != bracketMap[char]) {
                return false // Mismatched brackets
            }
        }
    }

    /*
     * Step 6:
     * If stack is empty at the end, all brackets matched
     */
    return stack.isEmpty()
}
