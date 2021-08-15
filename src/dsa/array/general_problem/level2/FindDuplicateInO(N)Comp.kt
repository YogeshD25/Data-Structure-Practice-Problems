package dsa.array.general_problem.level2

import kotlin.math.abs

fun main() {
    val array = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    printRepeating(array,array.size)
}

fun printRepeating(arr: IntArray, size: Int) {
    println("The repeating elements are : ")
    var i: Int = 0
    while (i < size) {
        for(index in arr.indices){
            println(arr[index])
        }
        val j = abs(arr[i])
        if (arr[j] >= 0){
            arr[j] = -arr[j]
        } else {
            print("$j ")
        }
        i++
    }
}