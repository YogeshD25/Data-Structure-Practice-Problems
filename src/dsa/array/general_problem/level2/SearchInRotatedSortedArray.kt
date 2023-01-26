package dsa.array.general_problem.level2

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    var array= intArrayOf(4,5,6,7,0,1,2)
    var search = 0

    println(findElementInSortedRotatedArray(array, search))
}

fun binarySearch(arr: IntArray, searchElement: Int): Int{

    var l = 0
    var h = arr.size-1
    var mid = 0

    while(l<=h){
        mid = (l+h)/2
        if(arr[mid] == searchElement){
            return mid
        } else if(arr[mid] > searchElement){
            h = mid - 1

        } else {
            l = mid +1
        }
    }

    return -1


}

fun findElementInSortedRotatedArray(array: IntArray, searchElement: Int): Int{
    var threshold = 0

    for(i in 0..array.size-2){

        if(array[i+1]< array[i]){
            threshold = i
            break

        }

    }

    var arr1 = array.copyOfRange(0, threshold+1)
    var arr2 = array.copyOfRange(threshold+1, array.size)

    if(binarySearch(arr1, searchElement) == -1 && binarySearch(arr2, searchElement) == -1){
        return -1
    }

   if(binarySearch(arr1, searchElement) != -1){
        return binarySearch(arr1, searchElement)
    } else {
        return binarySearch(arr2, searchElement) + threshold+1
    }


}