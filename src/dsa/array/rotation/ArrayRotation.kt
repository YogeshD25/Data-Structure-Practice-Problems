package dsa.array.rotation


import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val d = scan.nextLine().trim().toInt()


    var arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()


//    rotateNaiveArray(arr, n, d)

    rotateNthTime(arr, n, d)


//    cyclicRotate(arr,n)

//    println()
//    for (i in arr){
//        print("$i ")
//    }


}

fun rotateNaiveArray(arr: Array<Int>, n: Int, d: Int) {

    val tempList = mutableListOf<Int>()
    for (item in 0 until d) {
        tempList.add(arr[item])
    }
    val actualList = arr.toMutableList()
    for (item in 0 until d) {
        actualList.removeAt(item)
    }

    val finalList = actualList + tempList

    println(finalList)
}

fun rotateNthTime(arr: Array<Int>, n: Int, d: Int) {
    var temp: Int? = null

    var array = arr

    for (i in 0 until d) {
        temp = arr[0]
        array = rotateArray(array, temp)
    }

    for (i in array) {
        print("$i ")
    }

    for (i in arr) {
        print("$i ")
    }
}

fun rotateArray(arr: Array<Int>, temp: Int): Array<Int> {

    for (i in 0 until arr.size - 1) {
        arr[i] = arr[i + 1]
    }
    arr[arr.size - 1] = temp

    return arr

}

fun cyclicRotate(arr: Array<Int>, n: Int) {

    var array = arr

    var start = 0
    var end = n-1
    while (start < end) {
        var temp = array[start]
        array[start] = array[end]
        array[end] = temp

        start++
        end--
    }


    for (i in array){
        print("$i ")
    }

    for (i in arr){
        print("$i ")
    }


}
