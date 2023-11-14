package dsa.array.pair

fun main(){

    var input = readLine()!!.split(" ").map {it.toInt() }

    var row = input[0]
    var column = input[1]

    var intArray = Array(row){IntArray(column)}

    for(i in 0..row){
        intArray[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toIntArray()
    }

    var array = readLine()!!.split(" ")

    findJudgeFromMatrix(intArray)








}

fun findJudgeFromMatrix(array: Array<IntArray>) {
    TODO("Not yet implemented")
}
