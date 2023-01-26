package dsa.array.general_problem.level1

import java.util.Arrays
import kotlin.math.min

fun main() {
    var arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    nextPermutation(arr)
}



fun nextPermutation(arr: IntArray): Unit {
    var threshold = -1
    for (i in arr.size - 1 downTo 1) {

        if (arr[i] > arr[i - 1]) {

            threshold = i
            break
        }

    }


    if (threshold == -1) {
        Arrays.sort(arr)
    } else {
        // Optimal swap
        val t1 = arr[threshold - 1]
        var swapIndex = threshold
        for (i in threshold + 1 until arr.size) {
            if (t1 < arr[i]) {
                swapIndex = i
            }
        }

        val temp = arr[threshold - 1]
        arr[threshold - 1] = arr[swapIndex]
        arr[swapIndex] = temp


        val tempArr = arr.copyOfRange(threshold, arr.size)
        Arrays.sort(tempArr)

        for (i in threshold until arr.size) {
            arr[i] = tempArr[i - threshold]
        }
    }

    for (value in arr) {
        println(value)
    }
}