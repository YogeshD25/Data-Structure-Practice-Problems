package dsa.nothing

import kotlin.math.abs
import kotlin.math.ceil

fun main() {

    val array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    val key = readLine()!!.toInt()
    println(performBinarySearch(array, key))


}

fun performBinarySearch(array: Array<Int>, key: Int): Boolean {

    var l = 0
    var r = array.size - 1

    while (l <= r) {
        var mid = ceil(((l + r) / 2).toDouble()).toInt()
        if (array[mid] == key) {
            return true
        } else if (array[mid] > key) {
            r = mid - 1
        } else if (array[mid] < key) {
            l = mid + 1
        }
    }

    return false

}

