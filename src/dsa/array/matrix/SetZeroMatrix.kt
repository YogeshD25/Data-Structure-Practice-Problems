import java.util.*

fun main() {
//    var arr1 = intArrayOf(1,1,1)
//    var arr2 = intArrayOf(1,0,1)
//    var arr3 = intArrayOf(1,1,1)
//    var arr = arrayOf(IntArray(3))
//
//
//    arr[0] = arr1
//    arr[1] = arr2
//    arr[2] = arr3
//
//
//    findSetMatrixZero(arr)


    val roColArray = readLine()!!.trimEnd().split(" ").map { it.toInt() }
    val row = roColArray[0]
    val column = roColArray[1]

    val matrixArray = Array(row) { IntArray(column) }
    for (i in 0 until row) {
        matrixArray[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toIntArray()
    }

    findSetMatrixZero(matrixArray)

}

fun findSetMatrixZero(arr: Array<IntArray>){

    var rArr = IntArray(arr[0].size){1}
    var cArr = IntArray(arr.size){1}

    for(i in 0..arr.size-1){
        for(j in 0..arr[i].size-1){

            if(arr[i][j] ==0){
                rArr[j] = 0
                cArr[i] = 0

            }
        }
    }


    for(i in 0..arr.size-1){
        for(j in 0..arr[i].size-1){

            if(rArr[j] == 0 || cArr[i] == 0){
                arr[i][j] = 0
            }

        }
    }

    for(i in 0..arr.size-1){
        for(j in 0..arr[i].size-1){
            print("${arr[i][j] }")
        }
        println()
    }
}

