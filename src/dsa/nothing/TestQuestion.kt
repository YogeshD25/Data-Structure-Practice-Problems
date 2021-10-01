package dsa.nothing

fun main() {

    var t = readLine()!!
    var n = readLine()!!.toInt()
    var array = readLine()!!.split(",").map { it }.toTypedArray()

    println(calculateResult(t, n, array))

}

fun calculateResult(t: String, n: Int, array: Array<String>): String {

    var s = ""
    var st = ""

    for (value in t) {
        if (array.contains(value.toString())) {
            s += value
        } else {
            s += value
            st += value
        }

        if ((s + st) == t) {
            return s
        }
    }

    return "-1"


}
