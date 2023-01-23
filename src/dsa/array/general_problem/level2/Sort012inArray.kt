package dsa.array.general_problem.level2

fun main() {
    val array = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    normalSort(array)
}

fun sortArray(array: Array<Int>) {
    var low = 0
    var mid = 0
    var high = array.size-1

    while (mid<=high){
        when (array[mid]) {
            0 -> {

                val temp = array[low]
                array[low] = array[mid]
                array[mid] = temp
                mid++
                low++
            }
            1 -> {
                mid++
            }
            else -> {
                val temp = array[mid]
                array[mid] = array[high]
                array[high] = temp
                high--
            }
        }
    }
    for (value in array){
        println("Sorted value ${value}")
    }

}

fun normalSort(array: Array<Int>){

    for (i  in array.indices){
        for(j in i+1 until array.size){

            if(array[j] < array[i]){
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
    }

    for (value in array){
        println(value)
    }
}
