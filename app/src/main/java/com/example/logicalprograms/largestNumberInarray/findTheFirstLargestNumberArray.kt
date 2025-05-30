package com.example.logicalprograms.largestNumberInarray


fun main(){
    findTheFirstLargestNumberArray()
}
fun findTheFirstLargestNumberArray() {

    var arrayList = arrayOf(99,222,33,44,4)
    var findLargestNumber = 0 //222

    /*
     * Step 1 : 99,222,33,44,4
     * Step 2 : 222
     * Step 3 : 33
     * Step 4 : 44
     * Step 5 : 4
     */
    for (i in arrayList){
        /*
         * Step 1 : 99
         *  99 > 0 (true) then findLargestNumber = 99
         *
         * Step 2 : 222
         * 222 > 99 (true) then findLargestNumber = 222
         *
         * Step 3 : 33
         * 33 > 222 (fail)
         *
         * Step 4 : 44
         * 44 > 222 ( fail)
         *
         * Step 5 : 4
         * 4 > 222 = fail
         *
         */
        if (i > findLargestNumber){
            findLargestNumber = i
        }
    }

    println(findLargestNumber)
}