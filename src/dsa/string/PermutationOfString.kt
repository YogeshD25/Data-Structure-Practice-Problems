package dsa.string

fun main() {
    var str = readLine()!!
//    findPermutatation(str)
//    permute(
//            str, 0, str.length - 1
//    )
    permute(str ,"")
}

fun findPermutatation(str: String): List<String> {

    if (str.isEmpty()) {
        return mutableListOf()
    }



    return mutableListOf()

}

fun permute(str: String, l: Int, r: Int) {
    var str = str
    if (l == r) println(str) else {
        for (i in l..r) {
            str = swap(str, l, i)
            permute(str, l + 1, r)
            str = swap(str, l, i)
        }
    }
}


fun swap(a: String, i: Int, j: Int): String {
    val temp: Char
    val charArray = a.toCharArray()
    temp = charArray[i]
    charArray[i] = charArray[j]
    charArray[j] = temp
    return String(charArray)
}

fun permute(s: String, answer: String) {
    if (s.isEmpty()) {
        print("$answer  ")
        return
    }
    for (i in s.indices) {
        val ch = s[i]
        val left_substr = s.substring(0, i)
        val right_substr = s.substring(i + 1)
        val rest = left_substr + right_substr
        permute(rest, answer + ch)
    }
}
