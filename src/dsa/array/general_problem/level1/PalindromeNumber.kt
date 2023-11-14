package dsa.array.general_problem.level1

fun main() {
    println(isPalindrome(11))
}

fun isPalindrome(x: Int): Boolean {
    var ans = true
    var number = x.toString()
    var i = 0
    var j = number.length - 1

    while (i != j && i <= number.length-1) {
        if (number[i] != number[j]) {
            ans = false
            break
        }
        i++
        j--
    }

    return ans

}