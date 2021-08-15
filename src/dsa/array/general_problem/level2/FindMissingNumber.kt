package dsa.array.general_problem.level2

fun main() {

    val array = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

//    getMissingNoUsingXOR(array,array.size)
    getMissingNo(array,array.size)

}


fun getMissingNo(a: IntArray, n: Int): Int {
    var total = 1
    for (i in 2..n + 1) {
        println("value of i $i")
        total += i
        println("Total before $total")
        total -= a[i - 2]
        println("Total after $total")
        println()
    }

    println()
    println("final total $total")
    return total
}

fun getMissingNoUsingXOR(a: IntArray, n: Int): Int {
    var x1 = a[0]
    var x2 = 1

    for (i in 0 until n) {
        println(a[i])
        x1 = x1 xor a[i]
    }

    println()

    for (i in 1..n + 1){
        println(i)
        x2 = x2 xor i
    }
    println()


    println(x1 xor x2)
    return x1 xor x2
}