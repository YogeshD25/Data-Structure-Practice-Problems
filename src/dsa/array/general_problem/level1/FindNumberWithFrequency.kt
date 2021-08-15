package dsa.array.general_problem.level1

fun main(){
    val stringInput = readLine()!!.split(" ").map{ it.trim().toInt() }.toTypedArray()
    val num = readLine()!!.toInt()
    val freq = readLine()!!.toInt()

    println(findOccurrenceWithFreq(stringInput,num,freq))

}

fun findOccurrenceWithFreq(intArrInput: Array<Int>, num: Int, freq: Int) : Boolean{
    var freqCount = 0
    for (value in intArrInput){
       if(value == num){
           freqCount++
       }
    }
    return freqCount == freq
}
