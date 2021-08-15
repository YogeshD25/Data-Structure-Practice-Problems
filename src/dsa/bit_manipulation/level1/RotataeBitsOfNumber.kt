package dsa.bit_manipulation.level1

fun main() {
    val num = readLine()!!.toInt()
    val numBinary = Integer.toBinaryString(num)!!

    val d = readLine()!!.toInt()

    println("The value of a $num having binary ${numBinary}")

    rotateBitToLeft(num, d, numBinary.length)


    println("The value of ans ${leftRotate(num, d, numBinary.length)} having binary ${leftRotate(num, d, numBinary.length).toString(2)}")

}

fun rotateBitToLeft(num: Int, d: Int, length: Int) {

    val a = num shl d
    val b = num shr (length - d)
    val ans = a or b
    println("The value of a $a having binary ${a.toString(2)}")
    println("The value of b $b having binary ${a.toString(2)}")
    println("The value of ans $ans having binary ${ans.toString(2)}")


}

fun leftRotate(n: Int, d: Int, length: Int): Int {
    val INT_BITS = 32
    return n shl d or (n shr 64 - d)
}
