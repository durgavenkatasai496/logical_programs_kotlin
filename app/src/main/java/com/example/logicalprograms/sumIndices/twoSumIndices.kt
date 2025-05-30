package com.example.logicalprograms.sumIndices


fun main() {
    twoSumIndices()
}


fun twoSumIndices() {
    val arrayChecking = arrayOf(1, 11, 22, 33, 4)
    val target = 5

    /*
     * Array Values     : [1, 11, 22, 33, 4]
     * Array Indices    :  0   1   2   3  4
     * Target Sum       : 5
     */

    for (i in arrayChecking.indices) {

        /*
         * Outer loop - i goes from 0 to 4
         * Step 1: i = 0 → value = 1
         * Step 2: i = 1 → value = 11  (won’t reach here if match is found earlier)
         * ...
         */

        for (j in i + 1 until arrayChecking.size) {

            /*
             * Inner loop - j starts from i+1 to end
             *
             * For i = 0 → j = 1 to 4
             *
             * Step 1: i = 0, j = 1 → 1 + 11 = 12 ❌
             * Step 2: i = 0, j = 2 → 1 + 22 = 23 ❌
             * Step 3: i = 0, j = 3 → 1 + 33 = 34 ❌
             * Step 4: i = 0, j = 4 → 1 + 4 = 5 ✅ match found
             */

            if (arrayChecking[i] + arrayChecking[j] == target) {
                println("Printing the Indices : $i , $j") // Output: 0 , 4
                // Exit function after finding the first match

                //Note : *******************
                // These return only one's first execute return , i you want to all check the scenario then remove the return
                return
            }
        }

        /*
         * If no match found for current i, outer loop continues
         * But in this example, match is found when i = 0 and j = 4
         * So the loop will stop there due to return
         */
    }

    /*
     * This will only print if no matching pair is found in the entire array
     */
    println("No two numbers found with sum $target")
}
