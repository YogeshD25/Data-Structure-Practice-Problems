package dsa.array.general_problem.level1

fun main() {

    val arr  = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    moveNegativeToStart(arr,0,arr.size-1)
    moveNegativeAlternate(arr.size,arr)
}

fun moveNegativeToStart(arr: Array<Int>, _left:Int, _right:Int){

    var left = _left
    var right = _right

    while (left <= right) {

        if (arr[left] < 0 && arr[right] < 0)
            left++;
        else if (arr[left] > 0 && arr[right] < 0) {
            val temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        } else if (arr[left] > 0 && arr[right] > 0)
            right--;
        else {
            left++;
            right--;
        }
    }

    for (value in arr){
        print(" $value")
    }
}

fun moveNegativeAlternate(t: Int, arr: Array<Int>) {

    var j = 0
    var temp: Int
    for (i in 0 until t) {
        if (arr[i] < 0) {
            if (i != j) {
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
            j++
        }
    }
    println()
    for (value in arr){
        print(" $value")
    }
}