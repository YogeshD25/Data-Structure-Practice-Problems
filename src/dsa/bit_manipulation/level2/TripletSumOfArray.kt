package dsa.bit_manipulation.level2

fun main() {
    val array = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    val d = readLine()!!.toInt()

    println(findTripletValueToBeSame(array, d))
}

fun findTripletValueToBeSame(array: IntArray, d: Int): Boolean {

    val tempArray = array.sortedArray()


    for (index in 0..array.size - 2) {

        var index2 = index + 1
        var indexLast = array.size - 1

        while (index2 < indexLast) {
            when {
                tempArray[index] + tempArray[index2] + tempArray[indexLast] == d -> {
                    return true
                }
                tempArray[index] + tempArray[index2] + tempArray[indexLast] < d -> {
                    index2++
                }
                else -> {
                    indexLast--
                }
            }
        }
    }



    return false

}
