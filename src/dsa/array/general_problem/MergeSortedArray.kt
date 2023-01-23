package dsa.array.general_problem

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    var arr1 = arrayOf(1, 2, 3, 4, 5)
    var arr2 = arrayOf(3, 4, 5, 6, 7, 8)
    mergeTwoSortedArray(arr1, arr2)
}

fun mergeTwoSortedArray(arr1: Array<Int>, arr2: Array<Int>) {
    val resultArr = IntArray(arr1.size + arr2.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            resultArr[k] = arr1[i]
            i += 1
        } else {
            resultArr[k] = arr2[j]
            j += 1
        }
        k += 1

    }

    while (i < arr1.size) {
        resultArr[k] = arr1[i]
        i += 1
        k += 1
    }

    while (j < arr2.size) {
        resultArr[k] = arr2[j]
        j += 1
        k += 1


    }


    for (value in resultArr) {
        println(value)
    }


}