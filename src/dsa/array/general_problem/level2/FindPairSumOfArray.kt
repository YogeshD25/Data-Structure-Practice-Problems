package dsa.array.general_problem.level2

import java.util.*


fun main() {

    val array = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val sum = readLine()!!.toInt()
    println(getPairsUsingMap(array, sum))
}

fun getPairsCount(arr: IntArray, sum: Int) {
    var count = 0

    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == sum) count++
        }
    }
    println("Count of pairs is  $count")
}

fun getPairsUsingMap(arr: IntArray, sum: Int): Int {
    var ans = 0

    val mutableMap = mutableMapOf<Int, Int>()
    for (value in arr) {

        if (!mutableMap.containsKey(value)) {
            mutableMap[value] = 0
        }
        mutableMap[value] = (mutableMap.getValue(value)) + 1

    }


    var twiceCount = 0

    for (i in arr.indices) {
        if (mutableMap[sum - arr[i]] != null) twiceCount += mutableMap[sum - arr[i]]!!
        if (sum - arr[i] === arr[i]) twiceCount--
    }


    return twiceCount /2

}

fun getPairsCountMap(n: Int, sum: Int, arr: IntArray): Int {
    val hm = HashMap<Int, Int?>()

    for (i in 0 until n) {

        if (!hm.containsKey(arr[i])) hm[arr[i]] = 0
        hm[arr[i]] = hm[arr[i]]!! + 1
    }

    println(hm)
    var twice_count = 0


    for (i in 0 until n) {
        if (hm[sum - arr[i]] != null) twice_count += hm[sum - arr[i]]!!

        if (sum - arr[i] === arr.get(i)) twice_count--
    }

    return twice_count / 2
}