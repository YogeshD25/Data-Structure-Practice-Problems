package dsa.array.general_problem.level1

fun main() {

    val array1 = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val array2 = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    findUnionOfTwoArray(array1, array2)
    findIntersectionOfTwoArray(array1, array2)
    findUnionWithoutRepetitionOfNonSortedArray(array1, array2)
    findUnionWithoutRepetitionOfSortedArray(array1,array2)
}

fun findIntersectionOfTwoArray(array1: IntArray, array2: IntArray) {

    println("Intersection of two array")
    var arr1Length = array1.size
    var arr2Length = array2.size
    var i = 0
    var j = 0

    while (i < arr1Length && j < arr2Length) {
        when {
            array1[i]< array2[j] -> {
                i++
            }
            array2[j]<array1[i] -> {
                j++
            }
            else -> {
                print("${array2[j++]} ")
                i++;
            }
        }
    }

}

fun findUnionOfTwoArray(array1: IntArray, array2: IntArray) {

    println("Union of two array")
    var arr1Length = array1.size
    var arr2Length = array2.size
    var i = 0
    var j = 0

    while (i < arr1Length && j < arr2Length) {
        when {
            array1[i]< array2[j] -> {
                print("${array1[i++]} ")
            }
            array2[j]<array1[i] -> {
                print("${array2[j++]} ")
            }
            else -> {
                print("${array2[j++]} ")
                i++;
            }
        }
    }

    while (i < arr1Length)
        print("${array1[i++]} ");
    while (j < arr2Length)
        print("${array2[j++]} ");

}


/**
 *
 *
 * Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
 * If there are repetitions, then only one occurrence of element should be printed in the union.
 */

fun findUnionWithoutRepetitionOfNonSortedArray(arr1: IntArray, arr2: IntArray) {
    var set = mutableSetOf<Int>()

    for(i in 0..arr1.size-1) {
        set.add(arr1[i])
    }

    for (i in 0..arr2.size-1) {
        set.add(arr2[i])
    }

    println(set.size)
}

fun findUnionWithoutRepetitionOfSortedArray(arr1: IntArray, arr2: IntArray) {
    var m = arr1.size - 1
    var n = arr2.size - 1
    var i = 0
    var j = 0
    var unionList = mutableListOf<Int>()
    while (i <= m && j <= n) {
        when {
            arr1[i] < arr2[j] -> {
                unionList.add(arr1[i])
                i++
            }
            arr1[i] > arr2[j] -> {
                unionList.add(arr2[j])
                j++
            } else -> {
                unionList.add(arr1[i])
                i++
                j++
            }
        }
    }

    while (i <= m){
        unionList.add(arr1[i])
        i++
    }
    while (j <= n){
        unionList.add(arr2[j])
        j++
    }
    println(unionList)
}
