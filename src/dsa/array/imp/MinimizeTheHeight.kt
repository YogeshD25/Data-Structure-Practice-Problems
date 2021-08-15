package dsa.array.imp


fun main() {
    var array  =  readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var k = readLine()!!.toInt()
    minimizeTheHeight(array,k)
}

fun minimizeTheHeight(array: IntArray,k:Int) {

    var tempArray = array.sortedArray()
    var small = 0
    var large  = 0
    var ans = array[array.last()] - array[0]

}
