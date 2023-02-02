package dsa.array.general_problem


fun main(){
    println(squareRoot(25))
}

fun squareRoot(num: Int): Double {
//temporary variable
    var t: Double
    var sqrtroot = (num / 2).toDouble()
    do {
        t = sqrtroot
        sqrtroot = (t + num / t) / 2
    } while (t - sqrtroot != 0.0)
    return sqrtroot
}