package com.example.logicalprograms.largestNumberInarray

fun main(){
    findTheSecondLargestNumberArray()
}

fun findTheSecondLargestNumberArray() {

    var arrayList = arrayOf(11,2,9,55,67,99)
    var firstLargestNumber = 0
    var secondLargestNumber = 0


    /*
     * 11,2,9,55,67,99
     * Step 1 : 11
     * Step 2 : 2
     * Step 3 : 9
     * Step 4 : 55
     * Step 5 : 67
     * Step 6 : 99
     *
     */
    for (i in arrayList){
        /*
         * Step 1 : 11 > 0 = true
         * Step 2 : 2 > 11 = (fail)
         * Step 3 : 9 > 11 = (fail)
         * Step 4 : 55 > 11 = true
         * Step 5 : 67 > 55 = true
         * step 6 : 99 > 67 = true
         */
        if (i > firstLargestNumber){
            /*
             * Step 1 :
             * secondLargestNumber = 0
             * firstLargestNumber = 11
             *
             * Step 4 :
             * secondLargestNumber = 11
             * firstLargestNumber = 55
             *
             * Step 5 :
             * secondLargestNumber = 55
             * firstLargestNumber = 67
             *
             * Step 6 :
             * secondLargestNumber = 67
             * firstLargestNumber = 99
             */
            secondLargestNumber = firstLargestNumber
            firstLargestNumber = i
        }
        /*
         * Step 2 :
         * 2 > 0 (true ) && 1 != 11 ( true)
         * Step 3 :
         * 9 > 2 (true) && 9 != 11 (true)
         */
        else if (i > secondLargestNumber && i != firstLargestNumber){
            /*
             * Step 2 :
             * secondLargestNumber = 2
             * Step 3 :
             * secondLargestNumber = 9
             */
            secondLargestNumber = i
        }
    }

    println(secondLargestNumber)
}