package dsa.stack

import java.util.Stack


fun main() {
    var array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    nearGreatestRight(array)
    nearestGreatestToLeft(array)
}

fun nearGreatestRight(array: Array<Int>) {

    val stack = Stack<Int>()
    val answerList = mutableListOf<Int>()

    for (i in array.size - 1 downTo 0) {

        if (stack.isEmpty()) {
            answerList.add(-1)
        } else if (stack.size > 0 && stack.peek() > array[i]){
            answerList.add(stack.peek())
        } else if(stack.size > 0 && stack.peek() <= array[i]) {
            while (stack.isEmpty().not() && stack.peek() <= array[i]) {
                stack.pop()
            }
            if (stack.isEmpty()) {
                answerList.add(-1)
            } else {
                answerList.add(stack.peek())
            }

        }
            stack.push(array[i])

    }
    println(answerList)
}

fun nearSmallestRight(array: Array<Int>) {

    val stack = Stack<Int>()
    val answerList = mutableListOf<Int>()

    for (i in array.size - 1 downTo 0) {

        if (stack.isEmpty()) {
            answerList.add(-1)
        } else if (stack.size > 0 && stack.peek() < array[i]){
            answerList.add(stack.peek())
        } else if(stack.size > 0 && stack.peek() >= array[i]) {
            while (stack.isEmpty().not() && stack.peek() >= array[i]) {
                stack.pop()
            }
            if (stack.isEmpty()) {
                answerList.add(-1)
            } else {
                answerList.add(stack.peek())
            }

        }
        stack.push(array[i])

    }
    println(answerList)
}

fun nearestGreatestToLeft(array: Array<Int>){

    val stack = Stack<Int>()
    val answerList = mutableListOf<Int>()

    for(i in 0..array.size-1){
        if (stack.isEmpty()){
            answerList.add(-1)
        } else if(stack.isNotEmpty() && stack.peek()> array[i]){
            answerList.add(stack.peek())
        } else if(stack.isNotEmpty() && stack.peek() <= array[i]){
            while (stack.isNotEmpty() && stack.peek() <= array[i]){
                stack.pop()
            }
            if (stack.isEmpty()) {
                answerList.add(-1)
            } else {
                answerList.add(stack.peek())
            }
        }
        stack.push(array[i])
    }
    println(answerList)
}


fun nearestSmallestToLeft(array: Array<Int>){

    val stack = Stack<Int>()
    val answerList = mutableListOf<Int>()

    for(i in 0..array.size-1){
        if (stack.isEmpty()){
            answerList.add(-1)
        } else if(stack.isNotEmpty() && stack.peek()< array[i]){
            answerList.add(stack.peek())
        } else if(stack.isNotEmpty() && stack.peek() >= array[i]){
            while (stack.isNotEmpty() && stack.peek() >= array[i]){
                stack.pop()
            }
            if (stack.isEmpty()) {
                answerList.add(-1)
            } else {
                answerList.add(stack.peek())
            }
        }
        stack.push(array[i])
    }
    println(answerList)
}