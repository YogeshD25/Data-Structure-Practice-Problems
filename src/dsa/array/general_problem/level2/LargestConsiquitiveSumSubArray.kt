package dsa.array.general_problem.level2


fun main(){
    val arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    println(largestContiguousSumSubArray(arr))
    println(circularSumSubArray(arr))
}
fun largestContiguousSumSubArray(array: Array<Int>): Int {

    var maxEnding = 0
    var maxSoFar = array[0]

    for(i in array.indices){
        maxEnding += array[i]

        if(maxEnding< array[i]) {
            maxEnding = array[i]
        }

        if(maxSoFar < maxEnding){
            maxSoFar = maxEnding
        }

    }
    return maxSoFar
}

fun circularSumSubArray(array: Array<Int>): Int {

    var ans = 0
    var total = 0
    var maxSubArraySumSoFar = 0
    var maxSubArraySumEnding = 0

    // Invert array element by * -1

    for (i in array.indices) {
        array[i] = array[i] * -1
    }

    for (i in array.indices) {
        maxSubArraySumEnding += array[i]
        total += array[i]

        if (maxSubArraySumEnding < array[i]) {
            maxSubArraySumEnding = array[i]
        }

        if (maxSubArraySumSoFar < maxSubArraySumEnding) {
            maxSubArraySumSoFar = maxSubArraySumEnding
        }
        ans = -(total - maxSubArraySumSoFar)

    }
    return ans
}