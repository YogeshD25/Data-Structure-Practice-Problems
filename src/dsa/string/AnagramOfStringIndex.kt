package dsa.string


// abcdebacb
// cab

//0, 5, 6

fun main() {
    var str = readLine()!!
    val p = readLine()!!
    anagramOfStringIndex(str, p)
}

fun anagramOfStringIndex(str: String, p: String) {
    var k = p.length
    val pMap = mutableMapOf<Char, Int>()
    val sMap = mutableMapOf<Char, Int>()

    for (i in 'a'..'z') {
        pMap[i] = 0
        sMap[i] = 0
    }
    for (i in 0 until p.length){
        pMap[p[i]] = pMap.getValue(p[i]) + 1
    }

    var z = 1
    var tempList = mutableListOf<Int>()
    for (i in 0 .. str.length - k ) {
        if (i != 0) {
            sMap[str[i - 1]] = 0

        } else {
            sMap[str[i]] = 1
        }
        for (j in z until  i + k) {
            var updatedValue = sMap.getValue(str[j]) + 1
            sMap[str[j]] = updatedValue
        }
        z = i + k

        if (compareTwoMap(pMap, sMap)) tempList.add(i)


    }
    println(tempList)


}

fun compareTwoMap(pMap: MutableMap<Char, Int>, sMap: MutableMap<Char, Int>): Boolean {
    var flag = true
    for (i in 'a'..'z') {
        if (sMap.getValue(i) != pMap.getValue(i)) {
            flag = false
        }
    }
    return flag
}



