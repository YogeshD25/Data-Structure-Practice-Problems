package dsa.string


fun main(){
    val str = readLine()!!


}
fun findAllSubSequence(str: String) {



    for (i in 0 until str.length){
        for(j in str.length-1 until i){




        }
    }
}

fun findCountDistinctSubsequence(str: String){

    var tempArr = IntArray(str.length){0}

    tempArr[0] = 1

    var map = mutableMapOf<Char, Int>()

    for(i in 1 until tempArr.size){
        tempArr[i] = tempArr[i-1]
        var ch = str[i-1]
        if(map.containsKey(ch)){
            val temp = map[ch]
            tempArr[i] = tempArr[i] - tempArr[temp ?: (0 - 1)]
        }
        map[ch] = i

    }

}