package dsa.string

import kotlin.math.min

fun main(){
    val str = readLine()!!
    println(minimumDeletionToMakeStringPalindrome(str, 0, str.length-1))
}

fun minimumDeletionToMakeStringPalindrome(str: String, i: Int, j: Int): Int{

    var start = i
    var end = j

    if(start>=end){
        return 0
    }
    if(str[start] == str[end]){
        return minimumDeletionToMakeStringPalindrome(str, start + 1, end-1)
    }

    return 1 + min(minimumDeletionToMakeStringPalindrome(str, start, end -1), minimumDeletionToMakeStringPalindrome(str, start + 1, end))

}