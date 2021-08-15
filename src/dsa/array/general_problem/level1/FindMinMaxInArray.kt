package dsa.array.general_problem.level1


fun main() {
    val arr = readLine()!!.split(",").map { it.toInt() }.toTypedArray()
    indMinMaxValueInArray(arr)
}

fun indMinMaxValueInArray(arr: Array<Int>) {
    var min = arr[0]
    var max = arr[0]

    for (index in arr.indices - (arr[0])) {
//        println("index : $index and array: ${arr[index]}")

        min = if (min< arr[index] ) {
            min
        } else {
            arr[index]
        }
    }

    for (index in arr.indices - (arr[0])) {
        max = if (max > arr[index]) {
            max
        } else {
            arr[index]
        }
    }

    println("The min : $min ==> The max : $max")

}
