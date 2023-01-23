package dsa.array.imp

import java.util.Arrays
import kotlin.math.max
import kotlin.math.min


/*
 *
 * 09:30 10:30                     1
10:00 11:30                       2
11:00 12:00                        1
11:00 12:00                       3
13:00 14:00

ans = 2

list 1030, 1130

*/
fun main() {
    var startArray = arrayOf(930, 1000, 1100, /*1100, 1300, 900*/)
    var endArray = arrayOf(1030, 1130, 1200, /*1200, 1400, 1000*/)

    println(findMinRoom(startArray, endArray))
    println(findMinRoomOptimised(startArray, endArray))
}

fun findMinRoom(startArray: Array<Int>, endArray: Array<Int>): Int {

    var ans = 1
    var roomRequired = 1
    for (i in 0 until startArray.size) {
        roomRequired = 1
        for (j in i+1 until endArray.size-1) {
            if (i != j) {
                if (endArray[i] > startArray[j]) {
                    roomRequired++
                }
            }
        }
        ans = max(ans, roomRequired)
    }

    return ans
}


fun findMinRoomOptimised(startArray: Array<Int>, endArray: Array<Int>): Int {

    Arrays.sort(startArray)
    Arrays.sort(endArray)

    var roomNeeded = 0
    var minRoomRequired = 0
    var i = 0
    var j = 0

    while (i<startArray.size && j<endArray.size){

        if(startArray[i] < endArray[j]){
            roomNeeded++
            i++
        } else {
            roomNeeded--
            j++
        }

        if(minRoomRequired < roomNeeded) minRoomRequired = roomNeeded
    }

    var array1 = arrayOf(1,2,3,4,5)


    return minRoomRequired


}
