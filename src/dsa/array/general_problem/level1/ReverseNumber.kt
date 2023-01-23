package dsa.array.general_problem.level1

fun main(){

    val arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    reverseNumber(arr, 0, arr.lastIndex)
}

fun reverseNumber(arr: Array<Int>, start: Int, lastIndex: Int) {

    var startIndex =  start
    var endIndex = lastIndex

    var temp = 0
    while(startIndex < endIndex){
        temp = arr[endIndex]
        arr[endIndex] =  arr[startIndex]
        arr[startIndex] = temp
        startIndex++
        endIndex--

    }
    for (i in 0..arr.lastIndex){
        println(arr[i])
    }


}
