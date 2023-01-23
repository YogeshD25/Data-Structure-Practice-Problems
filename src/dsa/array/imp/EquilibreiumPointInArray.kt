package dsa.array.imp


fun main(){
    val arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    println(equillibreiumPointInArray(arr))
}
fun equillibreiumPointInArray(arr: Array<Int>): Int {

    var total = 0
    var sum = IntArray(arr.size){0}

    for(i in arr.indices){
        total += arr[i]
        sum[i] = total
    }

    var lsum = arr[0]
    var rsum = 0
    for(i in 0 until arr.size-1){
        lsum = sum[i] - arr[i]
        rsum = total - sum[i]
        if(lsum == rsum){
            return i + 1
        }
    }
    return 0
}