package dsa.string

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    var str = "racecar"
    println(longestPalindrome(str))
}

fun longestPalindrome(s: String): String {

    if(s.isNullOrEmpty()) return ""

    var start = 0
    var end = 0
    for(i in 0..s.length-1){
        var len1 = expandFromMiddle(s,i,i)
        var len2 = expandFromMiddle(s, i, i+1)
        var len = Math.max(len1, len2)
        if(len > end-start){
            start = i - ((len-1)/2)
            end = i + (len/2)
        }
    }
    return s.substring(start, end+1)
}

fun expandFromMiddle(str: String, s: Int, e: Int): Int{
    var start = s
    var end = e
    if(str==null && start>end){
        return 0
    }

    while(start>=0 && end< str.length && str[start] == str[end]){
        start--
        end++
    }

    return end-start -1
}