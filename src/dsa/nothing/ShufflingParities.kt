package dsa.nothing

fun main() {

    var temp = intArrayOf(0,0,0,0,0)

    var t1 = Array(5) { 0 }

    for (value in t1){
        println(value)
    }

    var t = readLine()!!.toInt()
    for (value in 0 until t) {
        var n = readLine()!!.toInt()
        var array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()






        println(calculateParities(n, array))

    }
}

fun calculateParities(n: Int, array: Array<Int>): Int {

    var e = n / 2
    var o = if (n % 2 == 0) n / 2 else n / 2 + 1

    var ve = 0
    var vo = 0

    for (value in array) {
        if (value % 2 == 0) {
            ve += 1
        } else {
            vo += 1
        }
    }

    var even  = Math.min(e,vo)
    var odd  = Math.min(o,ve)

    return even + odd


}
