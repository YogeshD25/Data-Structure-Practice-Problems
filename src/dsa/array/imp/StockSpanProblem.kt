package dsa.array.imp

import java.util.*
import kotlin.math.abs

fun main() {
    var array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    stockSpanProblem(array)
}

fun stockSpanProblem(array: Array<Int>) {

    var stack = Stack<Pair<Int, Int>>()
    var answerList = mutableListOf<Int>()

    for(i in 0 until  array.size){

        if (stack.isEmpty()){
            answerList.add(-1)
        } else if(stack.isNotEmpty() && stack.peek().first > array[i]){
            answerList.add(stack.peek().second)
        } else if(stack.isNotEmpty() && stack.peek().first <= array[i]){
            while (stack.isNotEmpty() && stack.peek().first <= array[i]){
                stack.pop()
            }
            if (stack.isEmpty()) {
                answerList.add(-1)
            } else {
                answerList.add(stack.peek().second)
            }

        }
        stack.push(Pair(array[i], i))

    }

    println(answerList)

    for(i in 0 until answerList.size){
        println(abs(i-answerList[i]))
    }



}