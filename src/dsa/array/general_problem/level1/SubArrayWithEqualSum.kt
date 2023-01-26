package dsa.array.general_problem.level1

fun main() {
    var array= intArrayOf(1,2,3,7,5)
    var search = 95
    findSumInSubArray(array, search)


}

fun findSumInSubArray(arr: IntArray, sum: Int){

    var csum = 0

    var l = 0
    var h = 1

    if(arr[l] == sum){
        println("0 0")
        return
    }
    csum = arr[0]

    while(l<=h && h<= arr.size-1 && l<= arr.size-1){
        if((csum + arr[h]) > sum){
            csum = csum - arr[l]
            l++

        } else if((csum + arr[h]) < sum){
            csum = csum + arr[h]
            h++

        } else {
            println("${l+1} ${h+1}")
            return
        }
    }
    println("Not Found")

}