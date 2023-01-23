package dsa.string

fun main(){
    val str = readLine()!!
    findMaxOccuranceinString(str)
}
fun findMaxOccuranceinString(string: String) {
    var tempMap = mutableMapOf<Char, Int>()

    for (i in 0 until string.length ){
        if(tempMap.containsKey(string[i])){
                var prevVal =  tempMap.getValue(string[i])
                tempMap.put(string[i], ++prevVal)
            } else {
            tempMap.put(string[i], 1)
        }
    }

    println(tempMap.maxBy { it.value })
}