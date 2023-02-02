package dsa.string

fun main(){
    var str = readLine()!!
    var query = readLine()!!

    println(findLongestCommanSubsequence(str, query, str.length, query.length))
}

fun findLongestCommanSubsequence(str: String, query: String, m:Int, n:Int): Int {


    if(m== 0 || n==0) return 0

    if(str[m-1] == query[n-1]) {
        return 1+ findLongestCommanSubsequence(str, query, m-1, n-1)
    } else {
        return Math.max(findLongestCommanSubsequence(str, query, m-1, n),
            findLongestCommanSubsequence(str, query, m, n-1))
    }

}
