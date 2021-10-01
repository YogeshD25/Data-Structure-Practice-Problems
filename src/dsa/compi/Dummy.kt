package dsa.compi

fun get2ndArr(a: Array<Int>, n: Int): IntArray {
    var b = IntArray(n)

    b[0] = a[0]

    for (index in 1 until n) {
        if (a[index - 1] > a[index]) {
            val divAns = (a[index - 1] / a[index]).toInt() + 1
            b[index] = a[index] * divAns
        }

    }

    return b
}

fun main(){

}