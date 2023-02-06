package dsa.heap

import java.util.*


fun main(){
    var arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var k = readLine()!!.toInt()
    findKthMaxElement(arr, k)

    findKthMinElement(arr,k)
}

fun findKthMaxElement(arr: IntArray, k: Int) {
    var minHeap = PriorityQueue<Int>()

    for(i in 0..arr.size-1){


        minHeap.add(arr[i])

        if (minHeap.size>k) minHeap.remove(minHeap.peek())
    }

    println(minHeap)
    println()
}

fun findKthMinElement(arr: IntArray, k: Int) {
    var minHeap = PriorityQueue<Int>()

    val maxHeap = PriorityQueue<Int>() { a, b -> b - a }

    for(i in 0..arr.size-1){




        maxHeap.add(arr[i])
        if(maxHeap.size>k) maxHeap.remove(maxHeap.peek())
    }

    println(maxHeap)

}
