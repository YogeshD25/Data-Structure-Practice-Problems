package dsa.test

import java.lang.Integer.min
import java.lang.Math.abs

fun main(){
    var arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    println(findTrapWater(arr))
}

fun findTrapWater(arr: Array<Int>): Int {
    var result = 0
    var prefixArray = Array(arr.size){0}
    var suffixArray = Array(arr.size){0}

    prefixArray[0] = arr[0]
    suffixArray[arr.size-1] = arr[arr.size-1]

    var temp = arr[0]
    for(i in 1 until arr.size){
        if(temp<arr[i]){
            prefixArray[i] = arr[i]
            temp = arr[i]
        }else{
            prefixArray[i] = temp
        }
    }

    temp = arr[arr.size-1]
    for(i in arr.size-2 downTo 0){
        if(temp<arr[i]){
            suffixArray[i] = arr[i]
            temp = arr[i]
        }else{
            suffixArray[i] = temp
        }
    }

    print(prefixArray)
    print(suffixArray)



    for(i in arr.indices){
        if(min(prefixArray[i], suffixArray[i])-arr[i]!=0){
            println(abs(min(prefixArray[i], suffixArray[i])-arr[i]))
            result+= abs(min(prefixArray[i], suffixArray[i])-arr[i])
        }
    }

    return result


}
