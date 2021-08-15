package dsa.array.general_problem.level1

fun main() {
    val arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    sortUsingSelectionAlgo(arr)
}

fun sortUsingSelectionAlgo(arr: Array<Int>) {

    var min = 0
    for (i in arr.indices - (arr.size - 1)) {
        min = i
        for (j in i+1 until arr.size) {
            if (arr[j] < arr[min]) {
               min = j
            }
        }
        if(min!=i){
            val temp = arr[min]
            arr[min] = arr[i]
            arr[i] = temp
        }
    }

    for (value in arr) {
        print(" $value")
    }

}


/*fun sortUsingSelectionAlgo(arr: Array<Int>) {

    var min = 0
    for (i in arr.indices - (arr.size - 1)) {
        min = arr[i]
        for (j in arr.indices - i) {
            if (arr[j] > arr[i]) {
                var temp = arr[j]
                arr[j] = arr[i]
                arr[i] = temp
            }
        }
    }

    for (value in arr) {
        print(" $value")
    }

}*/