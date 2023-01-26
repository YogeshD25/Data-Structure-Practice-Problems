package dsa.array.matrix

fun main(){
    var rowColumn = readLine()!!.split(" ")
    var row = rowColumn[0].toInt()
    var column = rowColumn[1].toInt()

    var matrix = Array(row){IntArray(column)}

    for(i in 0..row-1){
        matrix[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }

    var searchElement = readLine()!!.toInt()

    findElementInOptimisedWay(matrix, searchElement)
}

fun findElementInOptimisedWay(matrix: Array<IntArray>, searchElement: Int){

    var i = 0
    var j = matrix.size-1

    while (i< matrix.size-1 && j>0){
        if(matrix[i][j] == searchElement){
            println("Found It")
            return
        }

        if(searchElement > matrix[i][j]){
            i++
        } else {
            j--
        }
    }
    println("Not Found")

}