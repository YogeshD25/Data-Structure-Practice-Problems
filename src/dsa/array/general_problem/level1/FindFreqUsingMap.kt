package dsa.array.general_problem.level1

fun main(){
    val arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    findMaxFreqOfNumber(arr)
}

fun findMaxFreqOfNumber(arr: Array<Int>) {

    val map = mutableMapOf<Int,Int>()

    for ((index,value)  in arr.withIndex()){
        if (map.containsKey(value) ){
            var temp  = map.get(value)!!
            temp++
            map.put(value, temp )
        }
        else map.put(value , 1);

    }


    println(map.maxWithOrNull(Comparator { a, b -> a.value.compareTo(b.value) }))

}
