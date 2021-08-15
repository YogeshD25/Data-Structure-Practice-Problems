package dsa.array.general_problem.level1

fun main() {
    val arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    val min = getMinValue(arr)
    val max = getMaxValue(arr)
    val range = max - min
    val range2 = max + min
    val coefficient:Double = range.toDouble() / range2.toDouble()
    println(coefficient)
}

fun getMinValue(arr: Array<Int>): Int {
    var min = arr[0]

    for (value in arr) {
        if (value < min) {
            min = value
        }
    }
    return min
}

fun getMaxValue(arr: Array<Int>): Int {
    var max = arr[0]

    for (value in arr) {
        if (value > max) {
            max = value
        }
    }
    return max
}
