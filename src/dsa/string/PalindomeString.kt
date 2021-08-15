package dsa.string


fun main() {

    var str = readLine()!!
    findPalindrome(str)
}

fun findPalindrome(str: String):Boolean {
    return str.reversed() == str

}
