package dsa.array.imp

import java.util.*


fun main(){

}

fun twoSum(nums: IntArray, target: Int): IntArray {

    var map = mutableMapOf<Int,Int>()
    var ans = IntArray(2){0}
    var total = 0
    for(value in nums){
        total += value
    }

    for(i in 0..nums.size-1){
        var calc = total - nums[i]
        if(map.contains(calc)){
            ans[0] = map.getValue(calc)
            ans[1] = i
            break

        } else {
            map.put(nums[i], i)
        }

    }

    return ans
}


fun threeSum(nums: IntArray): List<List<Int>> {

    var ansList = mutableListOf<List<Int>>()

    var arr = nums

    Arrays.sort(arr)



    for(i in 0..arr.size-2){
        //if(arr[i] == arr[i+1]) continue

        var l = i+1
        var r = arr.size-1

        while(l<r){
            if(arr[i] + arr[l] + arr[r] > 0){
                r--

            } else if(arr[i] + arr[l] + arr[r] < 0){
                l++

            } else {
                ansList.add(listOf(arr[i], arr[l], arr[r]))
                l++
                r--

            }

        }

    }

    println(ansList)

    return ansList

}
