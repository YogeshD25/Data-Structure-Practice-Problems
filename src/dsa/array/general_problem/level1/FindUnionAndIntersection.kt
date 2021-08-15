package dsa.array.general_problem.level1

fun main() {

    val array1 = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val array2 = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    findUnionOfTwoArray(array1, array2)
    findIntersectionOfTwoArray(array1, array2)
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
