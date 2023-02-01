package dsa.array.general_problem.level1

fun main() {

    var arr = intArrayOf(1)
//    var ans = 0
//    for(i in arr){
//        ans = ans xor arr[i]
//    }
    println(findSingleNonDuplicate(arr))
}

fun findSingleNonDuplicate(arr: IntArray): Int{
    var low = 0
    var mid = 0
    var high = arr.size -1


    if(high == 0){
        return arr[high]
    } else if(arr[0] != arr[1]){
        return arr[0]
    } else if(arr[arr.size-2] != arr[arr.size -1]){
        return arr[arr.size -1]
    }

    while(low<=high){

        mid = low + (high + low) /  2

        if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]){
            return arr[mid]
        }

        if((mid %2 == 1 && arr[mid] == arr[mid - 1]) || (mid %2 ==0 && arr[mid] == arr[mid + 1])){
                low = mid + 1
            } else{
            high = mid - 1
        }

    }

    return -1
}