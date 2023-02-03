package dsa.array.matrix

import javax.swing.text.html.HTML.Attribute.N




fun main(){
    val roColArray = readLine()!!.trimEnd().split(" ").map { it.toInt() }
    val row = roColArray[0]
    val column = roColArray[1]

    val matrixArray = Array(row) { IntArray(column) }
    for (i in 0 until row) {
        matrixArray[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toIntArray()
    }

    rotateItBy90(matrixArray)
}

fun rotateItBy90(matrixArray: Array<IntArray>) {
    var n = matrixArray.size

    for(i in 0 until n/2){
        for(j in i until n-i-1){

            var temp = matrixArray[i][j]
            matrixArray[i][j] = matrixArray[n-1-j][i]
            matrixArray[n-1-j][i] = matrixArray[n-1-i][n-1-j]
            matrixArray[n-1-i][n-1-j] = matrixArray[j][n-1-i]
            matrixArray[j][n-1-i] = temp
        }

    }

    for(i in 0..matrixArray.size-1){
        for(j in 0..matrixArray[i].size-1){
            print(matrixArray[i][j])
        }
        println()
    }

}
