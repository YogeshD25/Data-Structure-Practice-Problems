package dsa.array.imp

fun main() {
//    var array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    val num = arrayOf(1,2,3,5,6,7,9)
    val segArray = IntArray(4*num.size)
    constructTree(num,segArray)


}

fun constructTree(num: Array<Int>, segArray: IntArray) {

}
